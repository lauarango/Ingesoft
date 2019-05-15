package com.proyectofinal.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.service.ProjectService;
import com.proyectofinal.web.service.UserService;
/**
 * Project:Sigere
 * Developer:Verónica Tofiño
 * Contact email: veronicatofino@gmail.com
 * Creation date: 20/04/2019
 * Last modification: 15/05/2019
 */
@Controller
public class WelcomeController {
	//Create a User Service to access to it functions.
	@Autowired
	UserService userService;
	//Create a Project Service to access to it functions.
	@Autowired
	ProjectService projectService;
	//When loads the page from other view.
	@RequestMapping(value = "/bienvenido", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		//Verify that a user has logged in. If not, it is redirected to the home page
		if (request.getSession().getAttribute("user") == null) {
			//returns to the view .jsp in ModelAndView("View").
			return new ModelAndView("redirect:/home");
		}
		final User user = (User) request.getSession().getAttribute("user");
		final int id = userService.getIdByUser(user);
		final List<Project> projects = projectService.getProjectsByUserId(id);
		
		final StringBuilder builder = new StringBuilder();
		for (Project p : projects) {
			builder.append("<div class=\"column project\"> </br> <div class=\"content\"> <a href=\"proyecto?id=" + p.getId() + "\"><img src=\"https://static.thenounproject.com/png/213124-200.png\" alt=\"Market\" style=\"width:50%; float:center\"> </a></br>").append("<a href = \"proyecto?id=" + p.getId() + "\">").append(p.getName()).append("</a></br>").append("</div> </br> </div>");
			}
		//returns to the view .jsp in ModelAndView("View").
	    return new ModelAndView("welcome").addObject("projects", builder.toString()).addObject("firstname",user.getFirstname());
	  }
	
}
