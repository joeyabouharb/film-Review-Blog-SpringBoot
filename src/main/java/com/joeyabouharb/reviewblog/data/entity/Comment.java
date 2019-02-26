package com.joeyabouharb.reviewblog.data.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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

  @ManyToOne
  private Review review;

  public Review getReview() {
    return review;
  }

  public void setReview(Review review) {
    this.review = review;
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
}
