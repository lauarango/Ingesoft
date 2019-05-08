package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Requirement;
import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ReqCreate;

public interface RequirementDao {

	List<Requirement> getRequirementByProjectId(final int id);
	
	Requirement getRequirementById(final int id);
	
	void createRequirement(ReqCreate requirement);
	
}