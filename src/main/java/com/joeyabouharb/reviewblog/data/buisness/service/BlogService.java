package com.joeyabouharb.reviewblog.data.buisness.service;

import com.joeyabouharb.reviewblog.data.repository.CommentRepository;
import com.joeyabouharb.reviewblog.data.repository.FilmRepository;
import com.joeyabouharb.reviewblog.data.repository.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
private final FilmRepository filmRepository;
private final ReviewRepository reviewRepository;
private final CommentRepository commentRepository;

@Autowired
public BlogService(FilmRepository filmRepository, 
                   ReviewRepository reviewRepository,
                   CommentRepository commentRepository) {
  this.filmRepository = filmRepository;
  this.commentRepository = commentRepository;
  this.reviewRepository = reviewRepository;
}
}