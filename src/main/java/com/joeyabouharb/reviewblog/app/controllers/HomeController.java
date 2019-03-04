package com.joeyabouharb.reviewblog.app.controllers;

import java.util.List;

import com.joeyabouharb.reviewblog.data.buisness.domain.FilmReview;
import com.joeyabouharb.reviewblog.data.buisness.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@PreAuthorize("isAnonymous()")
public class HomeController {

   @Autowired
  private BlogService blogService;

  @GetMapping("/")
  @RequestMapping(method= RequestMethod.GET)
  public ModelAndView main() {
    ModelAndView modelAndView = new ModelAndView("home");
    List<FilmReview> filmReviews = blogService.getFilmReviewsOrderedByDate();
    modelAndView.addObject("filmReviews", filmReviews); 
    return modelAndView;
  } 
}