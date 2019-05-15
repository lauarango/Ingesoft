package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.RequirementDao;
import com.proyectofinal.web.model.ReqCreate;
import com.proyectofinal.web.model.Requirement;
/**
 * Project:Sigere
 * Developers:Laura Arango, Verónica Tofiño
 * Contact emails: lauarangom@gmail.com, veronicatofino@gmail.com
 * Creation date: 25/04/2019
 * Last modification: 15/05/2019
 */
public class RequirementServiceImpl implements RequirementService {
	//Create a Requirement Dao to access to its functions.
	@Autowired
	public RequirementDao requirementDao;
	//Returns the list of Requirements associated to a project.
	@Override
	public List<Requirement> getRequirementByProjectId(int id) {
		return requirementDao.getRequirementByProjectId(id);
	}
	//Returns a requirement by its id.
	@Override
	public Requirement getRequirementById(int id) {
		return requirementDao.getRequirementById(id);
	}
	//Create a new requirement.
	@Override
	public void createRequirement(ReqCreate requirement) {
		requirementDao.createRequirement(requirement);
	}
	

	

}