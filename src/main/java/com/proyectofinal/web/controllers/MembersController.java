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
import com.proyectofinal.web.model.User;
import com.proyectofinal.web.model.Member;
import com.proyectofinal.web.service.MemberService;
import com.proyectofinal.web.service.UserService;
import com.proyectofinal.web.service.ProjectService;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 09/05/2019
 * Last modification: 15/05/2019
 */
@Controller
public class MembersController {
	//Create a Member Service to access to it functions.
	  @Autowired
	  MemberService memberService;
	//Create a Project Service to access to it functions.
	  @Autowired
	  ProjectService projectService;
	//Create a User Service to access to it functions.
	  @Autowired
	  UserService userService;
	 //When loads the page from other view.
	  @RequestMapping(value = "/miembros", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response,
			  @RequestParam(name = "id") final int id) {
		//Verify that a user has logged in. If not, it is redirected to the home page
		  if (request.getSession().getAttribute("user") == null) {
			return new ModelAndView("redirect:/home");
		}
		final User user = (User) request.getSession().getAttribute("user");
		final List<Member> members = memberService.getUsersByProjectId(id);		
		final Project project = projectService.getProjectById(id);
		final StringBuilder builder = new StringBuilder();
		for (Member m : members) {
			User us = userService.getUserById(m.getUserId());
			String username = us.getUsername();
			builder.append("<li class=\"w3-bar\"><span class=\"w3-bar-item w3-button w3-shite w3-xlarge w3-right\">x</span><img src=\"https://image.flaticon.com/icons/png/512/78/78373.png\" class=\"w3-bar-item w3-circle w3-hide-small\" style=\"width:85px\"> <div class=\"w3-bar.item\">").append("<span class=\"w3-large\">" + username + "</span><br>").append("<span>"+ m.getRole() + "</span>").append("</div></li>");
		}
		//returns to the view .jsp in ModelAndView("View").
		return new ModelAndView("members").addObject("members", builder.toString()).addObject("firstnameAct",user.getFirstname());
	  }
	//When something is sent from the view to the controller. 
	  @RequestMapping(value = "/miembros", method=RequestMethod.POST)
	  public ModelAndView postCreation(HttpServletRequest request, HttpServletResponse response,
			  @RequestParam(name = "projectId") final int id, @RequestParam(name = "email") final String email, @RequestParam(name="role") final String role) {
		  System.out.println("ProjectId: "+id + " Email: "+email+ " Rol: " +role);
		  int idUser= userService.getIdByEmail(email);
		  System.out.println(" UserId:"+idUser);
		//returns to the view .jsp in ModelAndView("View").
		  return new ModelAndView("redirect:/miembros?id="+id);
		  
	  }
}
