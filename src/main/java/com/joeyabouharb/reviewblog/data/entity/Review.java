package com.joeyabouharb.reviewblog.data.entity;

import java.sql.Date;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name="review_tbl")
public class Review {

  @Id
  @Column(name="Id")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long Id;

  @Column(name="author")
  private String author;

  @Column(name="article", columnDefinition = "blob")
  private String[] article;

  @Column(name="rating")
  private int rating;

  @Column(name="review_date")
  private Date review_date;
  
  @OneToOne()
  @JsonIgnore()
  private Film film;

  @OneToMany(cascade = CascadeType.ALL,
  fetch = FetchType.LAZY,
  mappedBy = "review")
  private Set<Comment> comments;

  public Review(Comment... comment){
    this.comments.forEach(x-> x.setReview(this));
  }

  public Review(){

  }
  
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
  public String[] getArticle() {
    return article;
  }

  /**
   * @param article the article to set
   */
  public void setArticle(String[] article) {
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

  /**
   * @return the comments
   */
  public Set<Comment> getComments() {
    return comments;
  }

  /**
   * @param comments the comments to set
   */
  public void setComments(Set<Comment> comments) {
    this.comments = comments;
  }

  /**
   * @return the film
   */
  public Film getFilm() {
    return film;
  }

  /**
   * @param film the film to set
   */
  public void setFilm(Film film) {
    this.film = film;
  }
  
}
