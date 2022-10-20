package com.sparta.thefightingsheep.security;

import com.sparta.thefightingsheep.model.entity.user.User;
import com.sparta.thefightingsheep.model.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class AuthUserDetailService implements UserDetailsService {

    private final UserRepository repository;

    public AuthUserDetailService(UserRepository repository) {
        this.repository = repository;
    }



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> wrappedUser = repository.findByEmail(username);
        if (wrappedUser.isEmpty())
            throw new UsernameNotFoundException("Username not found");
        User user = wrappedUser.get();

        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), Set.of(new SimpleGrantedAuthority(user.getRole().name())));
    }
}
