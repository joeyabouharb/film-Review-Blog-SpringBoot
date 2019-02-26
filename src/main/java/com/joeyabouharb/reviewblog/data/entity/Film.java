package com.joeyabouharb.reviewblog.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="film_tbl")
public class Film {

  @Id
  @Column(name="Film_ID")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long Id;

  @Column(name="Title")
  private String title;

  @Column(name="Director")
  private String director;

  @Column(name="Details")
  private String details;

  @Column(name="Column_ID")
  private long categoryId;

  @Column(name="Review_ID")
  private long reviewId;

  /**
   * @return the id
   */
  public long getId() {
    return Id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    Id = id;
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
   * @return the categoryId
   */
  public long getCategoryId() {
    return categoryId;
  }

  /**
   * @param categoryId the categoryId to set
   */
  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }

  /**
   * @return the reviewId
   */
  public long getReviewId() {
    return reviewId;
  }

  /**
   * @param reviewId the reviewId to set
   */
  public void setReviewId(long reviewId) {
    this.reviewId = reviewId;
  }


}
