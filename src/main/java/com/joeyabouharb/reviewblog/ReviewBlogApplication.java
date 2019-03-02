package com.joeyabouharb.reviewblog;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.joeyabouharb.reviewblog.data.entity.Category;
import com.joeyabouharb.reviewblog.data.entity.Film;
import com.joeyabouharb.reviewblog.data.entity.Review;
import com.joeyabouharb.reviewblog.data.entity.Role;
import com.joeyabouharb.reviewblog.data.entity.User;
import com.joeyabouharb.reviewblog.data.repository.CategoryRepository;
import com.joeyabouharb.reviewblog.data.repository.FilmRepository;
import com.joeyabouharb.reviewblog.data.repository.ReviewRepository;
import com.joeyabouharb.reviewblog.data.repository.RoleRepository;
import com.joeyabouharb.reviewblog.data.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ReviewBlogApplication implements CommandLineRunner{
@Autowired
private ReviewRepository reviewRepository;
@Autowired
private FilmRepository filmRepository;
@Autowired
private CategoryRepository catRepository;
@Autowired
private UserRepository userRepository;
@Autowired
private RoleRepository roleRepository;

	public static void main(String[] args) {
    SpringApplication.run(ReviewBlogApplication.class, args);
    
  }
  
  @Override
  public void run(String... args) throws Exception {
   
   
    if(userRepository.count() == 0){
      User user = new User();
      user.setEmail("joey.abouharb@gmail.com");
      user.setPassword("$2b$12$jLYuApP4Aqhqf5WiKiJZsOse3BLTyLDsdWIg5QSq1RKbZ8zB2UF/q");
      user.setUsername("joeyadmin");
      Role role = new Role();
      role.setName("admin");
      roleRepository.save(role);
      user.setRole(role);
    }

    if(reviewRepository.count() == 0){
      Review review = new Review();
      review.setArticle("Test Article");
      review.setAuthor("Joey Abouharb");
      review.setRating(5);
      Calendar calender = Calendar.getInstance();
      calender.set(2019, 1, 02);
      Date date = new Date(calender.getTime().getTime());
      review.setReview_date(date);
      Category cat = new Category();
      cat.setName("Action");
      catRepository.save(cat);
      Film film = new Film();
      film.setCategory(cat);
      film.setDetails("Movie Details");
      film.setDirector("no one in particular");
      film.setTitle("Fake Film");
      calender.set(2015, 1, 11);
      date = new Date(calender.getTime().getTime());
      film.setRelease_date(date);
      filmRepository.save(film);
      review.setFilm(film);
      reviewRepository.save(review);
    }
  }

  
}
