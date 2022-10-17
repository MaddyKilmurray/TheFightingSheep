package com.sparta.thefightingsheep.security;

import com.sparta.thefightingsheep.model.user.*;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class AuthUserDetailService implements UserDetailsService {

    private UserRepository userRepository;
    private AuthorisedUserRepository authorisedUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByName(username);
        AuthorisedUser authUser = authorisedUserRepository.findAuthorisedUserById(user.get().getId()).get();

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        authUser.getAuthorities()
                .forEach(role -> {
                    grantedAuthorities.add(new SimpleGrantedAuthority(role.getAuthority()));
                });

        return new AuthorisedUser(authUser.getId(),authUser.getUsername(), authUser.getPassword(), grantedAuthorities);
    }
}
