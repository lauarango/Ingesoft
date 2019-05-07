package com.proyectofinal.web.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proyectofinal.web.model.Specification;
import com.proyectofinal.web.model.Requirement;
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.service.SpecificationService;
import com.proyectofinal.web.service.RequirementService;
@Controller
public class RequirementController {
	@Autowired
	RequirementService requirementService;	
	
	@Autowired
	SpecificationService specificationService;
	  @RequestMapping(value = "/requirement", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response,
			  @RequestParam(name = "id") final int id) {
		if (request.getSession().getAttribute("user") == null) {
			return new ModelAndView("redirect:/home");
		}
		final User user = (User) request.getSession().getAttribute("user");
		final List<Specification> specifications = specificationService.getSpecificationByRequirementId(id);		
		final Requirement requirement = requirementService.getRequirementById(id);
		final StringBuilder builder = new StringBuilder();
		for (Specification r : specifications) {
			builder.append("Description: "+r.getDescr()+" Name:"+ r.getName()+" Id:"+ r.getId());
		}
	    return new ModelAndView("requirement").addObject("specifications", builder.toString());
	  }
}
