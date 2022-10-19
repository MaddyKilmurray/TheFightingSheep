package com.sparta.thefightingsheep.security;

import com.sparta.thefightingsheep.model.user.AuthorisedUser;
import com.sparta.thefightingsheep.model.user.Role;
import com.sparta.thefightingsheep.model.user.repository.AuthorisedUserRepository;
import com.sparta.thefightingsheep.model.user.repository.RoleRepository;
import com.sparta.thefightingsheep.model.user.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class AuthUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final AuthorisedUserRepository authorisedUserRepository;

    public AuthUserDetailService(UserRepository userRepository, RoleRepository roleRepository, AuthorisedUserRepository authorisedUserRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.authorisedUserRepository = authorisedUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthorisedUser authUser = authorisedUserRepository.findAuthorisedUserByUsername(username);
        System.out.println(authUser);
        if (authUser == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        authUser.getRoles()
                .forEach(role -> {
                    System.out.println(role);
                    Role authRole = roleRepository.findById(role).get();
                    System.out.println(authRole.getRole());
                    grantedAuthorities.add(new SimpleGrantedAuthority(authRole.toString()));
                    System.out.println(grantedAuthorities);
                });

        return new User(authUser.getUsername(), authUser.getPassword(), grantedAuthorities);
    }
}
