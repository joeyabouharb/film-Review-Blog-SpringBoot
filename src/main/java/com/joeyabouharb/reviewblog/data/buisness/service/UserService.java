package com.joeyabouharb.reviewblog.data.buisness.service;

import java.util.Optional;
import com.joeyabouharb.reviewblog.data.repository.RoleRepository;
import com.joeyabouharb.reviewblog.data.repository.UserRepository;
import com.joeyabouharb.reviewblog.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private UserRepository userRepository;

    private AuthenticationManager authenticationManager;

    private RoleRepository roleRepository;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, AuthenticationManager authenticationManager,
                       RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authenticationManager = authenticationManager;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Authentication signin(String username, String password) {
        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }

    public Optional<User> signup(String username, String password, String email) {
        if (!userRepository.findByUsername(username).isPresent()) {
            User user = new User();
            user.setEmail(email);
            user.setPassword(passwordEncoder.encode(password));
            user.setUsername(username);
            user.setRole(roleRepository.findByName("ROLE_USER").get());
            return Optional.of(userRepository.save(user));
        }
        return Optional.empty();
    }
  }