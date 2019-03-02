package com.joeyabouharb.reviewblog.data.repository;

import com.joeyabouharb.reviewblog.data.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

  
}