package com.proyectofinal.web.service;

import java.util.List;

import com.proyectofinal.web.model.Requirement;

import com.proyectofinal.web.model.ReqCreate;
/**
 * Project:Sigere
 * Developers:Laura Arango, Verónica Tofiño
 * Contact emails: lauarangom@gmail.com, veronicatofino@gmail.com
 * Creation date: 25/04/2019
 * Last modification: 15/05/2019
 */
public interface RequirementService{
	//Returns the Requirements of a Project.
	List<Requirement> getRequirementByProjectId(final int id);
	//Returns the requirement by its id.
	Requirement getRequirementById(final int id);
	//Creates a new requirement.
	void createRequirement(ReqCreate requirement);
	
}
