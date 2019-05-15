package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Specification;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 14/05/2019
 * Last modification: 15/05/2019
 */
public interface SpecificationDao {
    //Returns the specifications of a requirement.
	List<Specification> getSpecificationByRequirementId(final int id);
	//Returns a specification from it Id.
	Specification getSpecificationById(final int id);
	
}