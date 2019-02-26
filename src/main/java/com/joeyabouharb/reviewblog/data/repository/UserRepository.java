package com.joeyabouharb.reviewblog.data.repository;


import com.joeyabouharb.reviewblog.data.entity.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<User ,Long> {
  User findByUsername(String username);
  void ChangePassword(String passwordHash);
  User findByEmail(String email);

}