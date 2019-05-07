package com.proyectofinal.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ReqCreate;
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.service.RequirementService;

@Controller
public class CreateReqController{
	
	@Autowired
	RequirementService RequirementService;
	
	@RequestMapping(value = "/crearrequerimiento", method = RequestMethod.GET)
	  public ModelAndView getCreation(HttpServletRequest request, HttpServletResponse response,
			  @RequestParam(name = "id") int id) {
		if (request.getSession().getAttribute("user") == null) {
			return new ModelAndView("redirect:/home");
		}
	    return new ModelAndView("reqcreate").addObject("object", new ReqCreate());
	  }
	
	@RequestMapping(value = "/crearrequerimiento", method = RequestMethod.POST)
	  public ModelAndView postCreation(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("object") ReqCreate requirement,
			  @RequestParam(name = "id") int id) {
		final User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			return new ModelAndView("redirect:/home");
		}
		RequirementService.createRequirement(requirement);
		RequirementService.linkRequirementWithProject(requirement, new Project(id, null, null, null));
	    return new ModelAndView("redirect:/project?id="+id);
	  }
}
