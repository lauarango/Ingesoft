package com.proyectofinal.web.controllers;
/**
 * Project:Sigere
 * Developer:Laura Arango, Verónica Tofiño
 * Contact email: lauarangom@gmail.com, veronicatofino@gmail.com
 * Creation date: 25/04/2019
 * Last modification: 15/05/2019
 */
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
	//Create a Requirement Service to access to it functions.
	@Autowired
	RequirementService requirementService;	
	//Create a Specification Service to access to it functions.
	@Autowired
	SpecificationService specificationService;
	//When loads the page from other view.
	  @RequestMapping(value = "/requerimiento", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response,
			  @RequestParam(name = "id") final int id) {
		//Verify that a user has logged in. If not, it is redirected to the home page
		  if (request.getSession().getAttribute("user") == null) {
			//returns to the view .jsp in ModelAndView("View").
			return new ModelAndView("redirect:/home");
		}
		final User user = (User) request.getSession().getAttribute("user");
		final List<Specification> specifications = specificationService.getSpecificationByRequirementId(id);		
		final Requirement requirement = requirementService.getRequirementById(id);
		final StringBuilder builder = new StringBuilder();
		for (Specification r : specifications) {
			builder.append("<div class=\"mySlides\"><B>Código:</B><p>"+r.getCode()+"</p><br><B>Nombre:</B><p>"+r.getName()+"</p><br><B>Fecha:</B><p>"+r.getDate()+"</p><br><B>Grado de Necesidad:</B><p>"+r.getDegreeOfNeed()+"</p><br><B>Descripción:</B><p>"+r.getDescr()+"</p><br><B>Entradas:</B><p>"+r.getEntry()+"</p><br><B>Fuente:</B><p>"+r.getFont()+"</p><br><B>Salidas:</B><p>"+r.getOut()+"</p><br><B>Destino:</B><p>"+r.getDestiny()+"</p><br><B>Restricciones:</B><p>"+r.getRestriction()+"</p><br><B>Proceso:</B><p>"+r.getProcess()+"</p><br><B>Efecto Colateral:</B><p>"+r.getColateralEffect()+"</p><br></div>");
		}
		//returns to the view .jsp in ModelAndView("View").
	    return new ModelAndView("requirement").addObject("specifications", builder.toString()).addObject("id",requirement.getId()).addObject("firstname",user.getFirstname()).addObject("idFromUser",requirement.getReqId());
	  }
}
