package com.joeyabouharb.reviewblog.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review_tbl")
public class Review {

  @Id
  @Column(name="Review_ID")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int Id;

  @Column(name="Author")
  private String author;

  @Column(name="Article")
  private String article;

  @Column(name="Rating")
  private int rating;

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
   * @return the article
   */
  public String getArticle() {
    return article;
  }

  /**
   * @param article the article to set
   */
  public void setArticle(String article) {
    this.article = article;
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
  
}
