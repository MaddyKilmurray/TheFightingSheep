package com.sparta.thefightingsheep.security;

import com.sparta.thefightingsheep.model.user.AuthorisedUser;
import com.sparta.thefightingsheep.model.user.Role;
import com.sparta.thefightingsheep.model.user.repository.AuthorisedUserRepository;
import com.sparta.thefightingsheep.model.user.repository.RoleRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthUserDetailService implements UserDetailsService {

    private final RoleRepository roleRepository;
    private final AuthorisedUserRepository authorisedUserRepository;

    public AuthUserDetailService(RoleRepository roleRepository, AuthorisedUserRepository authorisedUserRepository) {
        this.roleRepository = roleRepository;
        this.authorisedUserRepository = authorisedUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthorisedUser authUser = authorisedUserRepository.findAuthorisedUserByUsername(username);
        System.out.println(authUser.toString());
        if (authUser == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        System.out.println(authUser.getRoles());
        authUser.getRoles()
                .forEach(role -> {
                    grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
                });
        User newUser = new User(authUser.getUsername(), authUser.getPassword(), grantedAuthorities);
        return newUser;
    }
}
