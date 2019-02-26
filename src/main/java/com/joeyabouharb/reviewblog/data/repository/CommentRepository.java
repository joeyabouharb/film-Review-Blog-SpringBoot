package com.joeyabouharb.reviewblog.data.repository;

import com.joeyabouharb.reviewblog.data.entity.Comment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

  
}