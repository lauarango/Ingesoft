package com.proyectofinal.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.proyectofinal.web.model.Login;
import com.proyectofinal.web.model.User;
/**
 * Proyecto:Sigere
 * Persona:Verónica Tofiño
 * Correo de contacto: veronicatofino@gmail.com
 * Fecha de creación: 17 de Ábril de 2019
 * Última modificación: 15 de Mayo de 2019
 */
@Controller
public class HomeController {
	//When loads the page from other view.
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		//Verify that a user has logged in. If not, it is redirected to the home page
		if (request.getSession().getAttribute("user") != null) {
			return new ModelAndView("welcome", "firstname", ((User) request.getSession().getAttribute("user")).getFirstname());
		}
	    ModelAndView mav = new ModelAndView("Home");
	    mav.addObject("login", new Login());
	    return mav;
	  }
	
	@RequestMapping(value = "/salir", method = RequestMethod.GET)
	  public ModelAndView logoutUser(HttpServletRequest request, HttpServletResponse response) {
	    request.getSession().setAttribute("user", null);
	  //returns to the view .jsp in ModelAndView("View").
		return new ModelAndView("redirect:/home");
	  }
}
