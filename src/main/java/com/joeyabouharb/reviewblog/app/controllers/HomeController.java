package com.joeyabouharb.reviewblog.app.controllers;


import java.util.List;

import com.joeyabouharb.reviewblog.data.buisness.domain.FilmReview;
import com.joeyabouharb.reviewblog.data.buisness.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @Autowired
  private BlogService blogService;

  @GetMapping("/")
  public String main() {
    List<FilmReview> reviews = this.blogService.GetAllFilmReviews();
    
    //model.addAttribute("reviews", reviews); 
    return "home";  
  }
}