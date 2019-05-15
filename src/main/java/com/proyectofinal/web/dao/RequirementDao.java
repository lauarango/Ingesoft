package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Requirement;
import com.proyectofinal.web.model.ReqCreate;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 30/04/2019
 * Last modification: 15/05/2019
 */
public interface RequirementDao {
    //Returns the requirements from a Project.
	List<Requirement> getRequirementByProjectId(final int id);
	//Return a requirement by it id.
	Requirement getRequirementById(final int id);
	//Creates a new requirement.
	void createRequirement(ReqCreate requirement);
	
}