package com.joeyabouharb.reviewblog.data.buisness.domain;

import java.sql.Date;

public class FilmReview {

  private long Review_ID;
  private String title;
  private String director;
  private String details;
  private String author;
  private int rating;
  private String name;
  private Date review_date;

  /**
   * @return the review_ID
   */
  public long getReview_ID() {
    return Review_ID;
  }

  /**
   * @param review_ID the review_ID to set
   */
  public void setReview_ID(long review_ID) {
    Review_ID = review_ID;
  }

 

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return the director
   */
  public String getDirector() {
    return director;
  }

  /**
   * @param director the director to set
   */
  public void setDirector(String director) {
    this.director = director;
  }

  /**
   * @return the details
   */
  public String getDetails() {
    return details;
  }

  /**
   * @param details the details to set
   */
  public void setDetails(String details) {
    this.details = details;
  }

  /**
   * @return the author
   */
  public String getAuthor() {
    return author;
  }

  /**
   * @param author the author to set
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  
  /**
   * @return the rating
   */
  public int getRating() {
    return rating;
  }

  /**
   * @param rating the rating to set
   */
  public void setRating(int rating) {
    this.rating = rating;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the review_date
   */
  public Date getReview_date() {
    return review_date;
  }

  /**
   * @param review_date the review_date to set
   */
  public void setReview_date(Date review_date) {
    this.review_date = review_date;
  }

}