package com.joeyabouharb.reviewblog.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment_tbl")
public class Comment {
	@Id
	@Column(name="Comment_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	@Column(name="User_Comment")
	private String userComment;

  @Column(name="Review_ID")
  private long reviewId;

  @Column(name="User_ID")
  private long userId;
  
  public long getReviewId() {
    return reviewId;
  }

  public void setReview(long reviewId) {
    this.reviewId = reviewId;
  }

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
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

  /**
   * @param reviewId the reviewId to set
   */
  public void setReviewId(long reviewId) {
    this.reviewId = reviewId;
  }

  /**
   * @return the userId
   */
  public long getUserId() {
    return userId;
  }

  /**
   * @param userId the userId to set
   */
  public void setUserId(long userId) {
    this.userId = userId;
  }
}
