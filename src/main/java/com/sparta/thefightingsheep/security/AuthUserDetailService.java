package com.sparta.thefightingsheep.security;

import com.sparta.thefightingsheep.model.entity.user.AuthorisedUser;
import com.sparta.thefightingsheep.model.repository.AuthorisedUserRepository;
import com.sparta.thefightingsheep.model.repository.UserRepository;
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

    private final UserRepository userRepository;
    private final AuthorisedUserRepository authorisedUserRepository;

    public AuthUserDetailService(UserRepository userRepository, AuthorisedUserRepository authorisedUserRepository) {
        this.userRepository = userRepository;
        this.authorisedUserRepository = authorisedUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthorisedUser authUser = authorisedUserRepository.findAuthorisedUserByUsername(username);
        if (authUser == null)
            throw new UsernameNotFoundException("Username not found");
        System.out.println(authUser);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        System.out.println(authUser.getUserRole());
        grantedAuthorities.add(new SimpleGrantedAuthority(authUser.getUserRole().getRole()));
        UserDetails newUser = new User(authUser.getUsername(), authUser.getPassword(), grantedAuthorities);
        return newUser;
    }
}
