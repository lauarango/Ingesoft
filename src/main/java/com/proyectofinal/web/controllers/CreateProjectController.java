/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 30/04/2019
 * Last modification: 15/05/2019
 */
package com.proyectofinal.web.controllers;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.proyectofinal.web.model.ProjectCreate;
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.service.ProjectService;

@Controller
public class CreateProjectController {
	//Create a Project Service to access to it functions.
	@Autowired
	ProjectService projectService;
	//When loads the page from other view.
	@RequestMapping(value = "/crearproyecto", method = RequestMethod.GET)
	  public ModelAndView getCreation(HttpServletRequest request, HttpServletResponse response) {
		if (request.getSession().getAttribute("user") == null) {
			return new ModelAndView("redirect:/home");
		}
	    return new ModelAndView("projectcreate").addObject("object", new ProjectCreate());
	  }
	//When something is sent from the view to the controller. 
	@RequestMapping(value = "/crearproyecto", method = RequestMethod.POST)
	  public ModelAndView postCreation(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("object") ProjectCreate project ) throws IOException, ServletException {
		//Verify that a user has logged in. If not, it is redirected to the home page 
		final User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			return new ModelAndView("redirect:/home");
		}
		projectService.createProject(project);
		projectService.linkProjectWithUser(project, user);
	    return new ModelAndView("redirect:/bienvenido");
	  }
}
