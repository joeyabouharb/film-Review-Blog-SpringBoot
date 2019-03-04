package com.joeyabouharb.reviewblog.data.buisness.domain;


public class ArticleComment{
  private long comment_ID;
  private String userComment;

  /**
   * @return the comment_ID
   */
  public long getComment_ID() {
    return comment_ID;
  }

  /**
   * @param comment_ID the comment_ID to set
   */
  public void setComment_ID(long comment_ID) {
    this.comment_ID = comment_ID;
  }

  /**
   * @return the userComment
   */
  public String getUserComment() {
    return userComment;
  }

  /**
   * @param userComment the userComment to set
   */
  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }
}