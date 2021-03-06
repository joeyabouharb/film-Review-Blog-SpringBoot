package com.joeyabouharb.reviewblog.data.repository;

import java.util.Optional;

import com.joeyabouharb.reviewblog.data.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User ,Long> {
 Optional<User> findByUsername(String username);
 // void ChangePassword(String passwordHash);
  //User findByEmail(String email);

}