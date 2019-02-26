package com.joeyabouharb.reviewblog.data.repository;

import java.util.List;

import com.joeyabouharb.reviewblog.data.entity.Review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
  List<Review> findByAuthor (String author);
}