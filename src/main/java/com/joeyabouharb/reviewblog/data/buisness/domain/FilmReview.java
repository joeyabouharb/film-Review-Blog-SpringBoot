package com.joeyabouharb.reviewblog.data.buisness.domain;

public class FilmReview {

  private long Review_ID;
  private long Film_ID;
  private long Category_ID;
  private String title;
  private String director;
  private String details;
  private String author;
  private String article;
  private int rating;
  private String name;

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
   * @return the film_ID
   */
  public long getFilm_ID() {
    return Film_ID;
  }

  /**
   * @param film_ID the film_ID to set
   */
  public void setFilm_ID(long film_ID) {
    Film_ID = film_ID;
  }

  /**
   * @return the category_ID
   */
  public long getCategory_ID() {
    return Category_ID;
  }

  /**
   * @param category_ID the category_ID to set
   */
  public void setCategory_ID(long category_ID) {
    Category_ID = category_ID;
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
}