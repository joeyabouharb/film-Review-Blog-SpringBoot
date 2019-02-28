package com.joeyabouharb.reviewblog.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "role_tbl")

public class Role {
  @Id
  @Column(name="Id")
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long Id;

  @Column(name="role_name")
  private String name;

  @OneToMany(cascade = CascadeType.ALL,
  fetch = FetchType.LAZY,
  mappedBy = "role")
  private Set<User> users;

  public Role(){

  }

  public Role(User... user){
    this.users.forEach(x-> x.setRole(this));
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
