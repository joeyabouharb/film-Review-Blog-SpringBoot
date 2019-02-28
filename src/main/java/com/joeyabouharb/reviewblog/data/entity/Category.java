package com.joeyabouharb.reviewblog.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category_tbl")

public class Category {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	@Column(name="category_name")
  private String name;

  @OneToMany(cascade = CascadeType.ALL,
  fetch = FetchType.LAZY,
  mappedBy = "category")
  private Set<Film> films;

  public Category(Film... film){
    this.films.forEach(x -> x.setCategory(this));
  }

  public Category(){

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
