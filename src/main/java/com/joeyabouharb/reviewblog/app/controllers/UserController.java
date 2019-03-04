package com.joeyabouharb.reviewblog.app.controllers;

import com.joeyabouharb.reviewblog.data.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

@Controller
public class UserController{
  
  @RequestMapping(value = "/user/registration", method = RequestMethod.GET)
public String showRegistrationForm(WebRequest request, Model model) {
    User userDto = new User();
    model.addAttribute("user", userDto);
    return "registration";
}
}