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

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.Requirement;
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.service.ProjectService;
import com.proyectofinal.web.service.RequirementService;

@Controller
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	RequirementService requirementService;
	  @RequestMapping(value = "/project", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response,
			  @RequestParam(name = "id") final int id) {
		if (request.getSession().getAttribute("user") == null) {
			return new ModelAndView("redirect:/home");
		}
		final User user = (User) request.getSession().getAttribute("user");
		final List<Requirement> requirements = requirementService.getRequirementByProjectId(id);		
		final Project project = projectService.getProjectById(id);
		final StringBuilder builder = new StringBuilder();
		for (Requirement r : requirements) {
			builder.append("<tr><td width=\"20%\">"+r.getReqId()+"</td>").append("<td width=\"40%\">").append("<a href = \"requirement?id=" + r.getId() + "\">").append(r.getName()).append("</a></td>").append("<td width=\"20%\">"+r.getType()+"</td>").append("<td><a class=\"btn btn-default\"><em class=\"fa fa-pencil\"></em></a><a class=\"btn btn-danger\"><em class=\"fa fa-trash\"></em></a></td></tr>");
		}
	    return new ModelAndView("project").addObject("name", project.getName()).addObject("desc", project.getDescription()).addObject("id",project.getId()).addObject("requirements", builder.toString()).addObject("firstname",user.getFirstname());
	  }
}
