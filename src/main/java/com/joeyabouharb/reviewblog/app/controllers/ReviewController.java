package com.joeyabouharb.reviewblog.app.controllers;

import com.joeyabouharb.reviewblog.data.buisness.domain.ReviewArticle;
import com.joeyabouharb.reviewblog.data.buisness.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ReviewController{
  @Autowired
  private BlogService blogService;

  @GetMapping(value="/review/{id}")
  public ModelAndView getMethodName(@PathVariable("id") Long id) {
    ModelAndView mv = new ModelAndView("review");
    ReviewArticle article = blogService.getArticle(id);
    mv.addObject("article", article);
      return mv;
  }
  
  
}