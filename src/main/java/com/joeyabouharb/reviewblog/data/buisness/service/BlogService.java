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

private final ReviewRepository reviewRepository;
@Autowired
public BlogService(ReviewRepository reviewRepository) {
  this.reviewRepository = reviewRepository;
}

public List<FilmReview> getFilmReviewsOrderedByDate(){
 Iterable<Review> reviews = this.reviewRepository.orderReviewsByLatest();
  Map<Long, FilmReview> filmReviewMap = new HashMap<>();

  reviews.forEach(review -> {
    FilmReview filmReview = new FilmReview();
    filmReview.setRating(review.getRating());
    filmReview.setAuthor(review.getAuthor());
    filmReview.setReview_date(review.getReview_date());
    filmReview.setReview_ID(review.getId());
    filmReview.setTitle(review.getFilm().getTitle());
    filmReview.setDetails(review.getFilm().getDetails());
    filmReview.setDirector(review.getFilm().getDirector());
    filmReviewMap.put(review.getId(), filmReview);
  });
  List<FilmReview> filmReviews = new ArrayList<>();
  for(Long Id:filmReviewMap.keySet()){
    filmReviews.add(filmReviewMap.get(Id));
  }

  return filmReviews;
}

}