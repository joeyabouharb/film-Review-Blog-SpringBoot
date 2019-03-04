package com.joeyabouharb.reviewblog.data.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import static org.springframework.security.core.userdetails.User.withUsername;

import java.util.Optional;

import com.joeyabouharb.reviewblog.data.entity.User;
import com.joeyabouharb.reviewblog.data.repository.UserRepository;

@Component
public class MyDetailsUserService implements UserDetailsService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username).orElseThrow(() -> 
    new UsernameNotFoundException(String.format("User with name %s does not exist",username)));
    GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().getName());
    return withUsername(user.getUsername())
                        .password(user.getPassword())
                        .authorities(authority)
                        .accountExpired(false)
                        .accountLocked(false)
                        .credentialsExpired(false)
                        .disabled(false)
                        .build();
  }
}
