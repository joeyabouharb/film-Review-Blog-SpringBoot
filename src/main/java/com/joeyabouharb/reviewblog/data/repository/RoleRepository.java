package com.joeyabouharb.reviewblog.data.repository;

import java.util.Optional;

import com.joeyabouharb.reviewblog.data.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(String name);

}