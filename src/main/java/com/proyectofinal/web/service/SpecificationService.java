package com.proyectofinal.web.service;

import java.util.List;

import com.proyectofinal.web.model.Specification;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email:lauarangom@gmail.com
 * Creation date: 26/04/2019
 * Last modification: 15/05/2019
 */
public interface SpecificationService{
	//Returns the specifications of a requirement.
	List<Specification> getSpecificationByRequirementId(final int id);
	//Returns a specification by its id. 
	Specification getSpecificationById(final int id);
	

}