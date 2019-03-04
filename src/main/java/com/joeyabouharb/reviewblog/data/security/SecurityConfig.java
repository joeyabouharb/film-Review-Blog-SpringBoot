package com.joeyabouharb.reviewblog.data.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;




@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
      return super.authenticationManagerBean();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder(12);
  }
  @Override
  protected void configure(final HttpSecurity http) throws Exception {
    http
      .authorizeRequests()
        .antMatchers("/", "/user/login", "/user/register", "/review/**")
          .permitAll()
        .antMatchers("/comment/post", "/user/details", "/user/changepassword", 
        "user/changedetails").authenticated()
        .antMatchers("/admin/**").hasRole("ADMIN")

        .and()

        .formLogin()
        .loginPage("/user/login")
        .failureUrl("/user/login?failure=true")
          .and()
          .logout()
          .permitAll();
        

  
}

}