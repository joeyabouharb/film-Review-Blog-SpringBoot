package com.joeyabouharb.reviewblog.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {
  @Id
  @Column(name="User_ID")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long Id;

  @Column(name="User_Name")
  private String username;

  @Column(name="Password_Hash")
  private String password;

  @Column(name="Email")
  private String email;

  @Column(name="Role_ID")
  private int roleID;

  @ManyToOne
  private Role role;

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
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * @param username the username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the roleID
   */
  public int getRoleID() {
    return roleID;
  }

  /**
   * @param roleID the roleID to set
   */
  public void setRoleID(int roleID) {
    this.roleID = roleID;
  }

  /**
   * @return the role
   */
  public Role getRole() {
    return role;
  }

  /**
   * @param role the role to set
   */
  public void setRole(Role role) {
    this.role = role;
  }

  

}
