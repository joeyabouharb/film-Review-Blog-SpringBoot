package com.joeyabouharb.reviewblog.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="film_tbl")
public class Film {

  @Id
  @Column(name="Film_ID")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int Id;

  @Column(name="Title")
  private String title;

  @Column(name="Director")
  private String director;

  @Column(name="Details")
  private String details;

  @ManyToOne
  private Category category;

  @ManyToOne
  private Review review;

  /**
   * @return the id
   */
  public int getId() {
    return Id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
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
   * @return the category
   */
  public Category getCategory() {
    return category;
  }

  /**
   * @param category the category to set
   */
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   * @return the review
   */
  public Review getReview() {
    return review;
  }

  /**
   * @param review the review to set
   */
  public void setReview(Review review) {
    this.review = review;
  }

}
