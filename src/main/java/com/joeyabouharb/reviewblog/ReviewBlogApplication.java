package com.joeyabouharb.reviewblog;

import java.sql.Date;
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
      user.setPassword("$2b$12$wGBFvL2EkmWOj2z2mumE8.HgYZvnk9jp60YSo26VkCb.RZFaqlwzu");
      user.setUsername("joeyadmin");
      Role role = new Role();
      role.setName("ROLE_ADMIN");
      roleRepository.save(role);
      Role normal = new Role();
      normal.setName("ROLE_USER");
      roleRepository.save(normal);
      user.setRole(role);
    }

    if(reviewRepository.count() == 0){
      Review review = new Review();
      String[] arr = new String[]
      {"Nullam condimentum enim mauris. Vivamus semper scelerisque tellus, eu ornare ante tincidunt sed. Duis ac ex id purus consequat maximus quis at quam. Nullam a tincidunt arcu, nec porttitor felis. Ut consectetur gravida orci quis eleifend. Donec vehicula arcu quis sem faucibus, eu fringilla tellus lobortis. Vestibulum interdum dapibus tellus et consectetur. Quisque sem orci, imperdiet nec laoreet a, bibendum in lacus. Quisque vel tristique eros, et placerat augue. Aliquam sagittis malesuada tellus, eu pretium tortor lobortis ut. Cras id ligula vitae arcu sodales condimentum ac sit amet neque. Aenean dignissim mollis lacus quis gravida.",
      "Aliquam dignissim sit amet nisi lobortis aliquet. Nunc rhoncus arcu eu lacinia lacinia. Integer suscipit urna sit amet iaculis mollis. Cras sit amet ex sed nibh vulputate viverra id at mauris. Proin sit amet arcu non nulla viverra aliquam. Donec nunc est, placerat ac nibh in, cursus congue nibh. Maecenas finibus porta tempor. Aliquam metus tortor, sollicitudin ut ipsum eget, semper tincidunt enim. Curabitur venenatis sem nibh, eget feugiat dui vulputate id. Nulla eu accumsan ante. Nam scelerisque odio molestie, convallis ex a, dictum metus. Maecenas dapibus magna ut orci ullamcorper elementum. Aenean interdum sodales felis a molestie.",
       "Cras eget efficitur orci. Sed sed ipsum aliquet, aliquam eros et, porta elit. Duis gravida semper rutrum. Sed sodales venenatis eleifend. Suspendisse enim nisl, sodales vel ullamcorper in, ullamcorper ut lorem. Donec porta leo non nulla tristique, id porta turpis faucibus. Phasellus quis eros elit. Donec quis neque vel nibh fermentum dignissim. Cras egestas nisi vel diam mollis, sit amet commodo eros egestas. Cras molestie viverra leo ut tempor. Vivamus pretium consectetur ante, quis laoreet velit sodales a. Aenean eu tellus sed purus feugiat efficitur eget a nulla. Sed ut tristique erat. Nam malesuada varius mauris sit amet sodales."};
      review.setArticle(arr);
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
