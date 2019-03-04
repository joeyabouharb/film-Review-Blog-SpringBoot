package com.joeyabouharb.reviewblog.data.buisness.domain;

import java.sql.Date;

public class ReviewArticle extends FilmReview {

  private Date release_date;
  private String[] article;

  /**
   * @return the release_date
   */
  public Date getRelease_date() {
    return release_date;
  }

  /**
   * @param release_date the release_date to set
   */
  public void setRelease_date(Date release_date) {
    this.release_date = release_date;
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


} 