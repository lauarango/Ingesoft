package com.proyectofinal.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.service.UserService;
/**
 * Project:Sigere
 * Developer:Verónica Tofiño
 * Contact email: veronicatofino@gmail.com
 * Creation date: 20/04/2019
 * Last modification: 15/05/2019
 */
@Controller
public class RegistrationController {
//Create a User Service to access to it functions.
  @Autowired
  public UserService userService;
//When loads the page from other view.
  @RequestMapping(value = "/registro", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());
    return mav;
  }
//When something is sent from the view to the controller. 
  @RequestMapping(value = "/procesoRegistro", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user) {
	//Verify that a user has logged in. If not, it is redirected to the home page
	  if (userService.existsUser(user)) {
		//returns to the view .jsp in ModelAndView("View").
		  return new ModelAndView("register").addObject("message", "User already exists.");
	  }
	  if (user.getUsername().isEmpty() || user.getPassword().isEmpty() || user.getFirstname().isEmpty() || user.getEmail().isEmpty()) {
		//returns to the view .jsp in ModelAndView("View").
		  return new ModelAndView("register").addObject("message", "Missing some attribute values");
	  }
	  userService.register(user);
	//returns to the view .jsp in ModelAndView("View").
	  return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
}