package com.joeyabouharb.reviewblog.data.buisness.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.joeyabouharb.reviewblog.data.buisness.domain.FilmReview;
import com.joeyabouharb.reviewblog.data.entity.Category;
import com.joeyabouharb.reviewblog.data.entity.Film;
import com.joeyabouharb.reviewblog.data.entity.Review;
import com.joeyabouharb.reviewblog.data.repository.CategoryRepository;
import com.joeyabouharb.reviewblog.data.repository.FilmRepository;
import com.joeyabouharb.reviewblog.data.repository.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
private final FilmRepository filmRepository;
private final ReviewRepository reviewRepository;
private final CategoryRepository categoryRepository;
@Autowired
public BlogService(FilmRepository filmRepository, 
                   ReviewRepository reviewRepository,
                   CategoryRepository categoryRepository) {
  this.filmRepository = filmRepository;
  this.reviewRepository = reviewRepository;
  this.categoryRepository = categoryRepository;
}
public List<FilmReview> GetAllFilmReviews(){
 
  return null;
}

}