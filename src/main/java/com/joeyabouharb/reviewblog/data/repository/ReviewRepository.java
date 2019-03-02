package com.joeyabouharb.reviewblog.data.repository;

import java.util.List;

import com.joeyabouharb.reviewblog.data.entity.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

  @Query(value = "SELECT * FROM review_tbl ORDER BY review_date DESC", nativeQuery = true )
  List<Review> orderReviewsByLatest();

}