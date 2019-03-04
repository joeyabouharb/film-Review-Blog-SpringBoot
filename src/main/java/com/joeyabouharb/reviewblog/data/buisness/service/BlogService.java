package com.joeyabouharb.reviewblog.data.buisness.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.joeyabouharb.reviewblog.data.buisness.domain.FilmReview;
import com.joeyabouharb.reviewblog.data.buisness.domain.ReviewArticle;
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
public ReviewArticle getArticle(Long id){

  Optional<Review> review = reviewRepository.findById(id);
  if(review.isPresent()){
    Review rev = review.get();
    ReviewArticle reviewArticle = new ReviewArticle();
    reviewArticle.setReview_ID(rev.getId());
    reviewArticle.setAuthor(rev.getAuthor());
    reviewArticle.setReview_date(rev.getReview_date());
    reviewArticle.setRating(rev.getRating());
    String[] arr = rev.getArticle();
    reviewArticle.setArticle(arr);
    Film film = rev.getFilm();
    reviewArticle.setRelease_date(film.getRelease_date());
    reviewArticle.setDirector(film.getDirector());
    reviewArticle.setDetails(film.getDetails());
    reviewArticle.setTitle(film.getTitle());
    Category category = film.getCategory();
    reviewArticle.setName(category.getName());

    return reviewArticle;
  } 
  return null;
}
}