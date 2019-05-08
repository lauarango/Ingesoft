package com.proyectofinal.web.service;

import java.util.List;

import com.proyectofinal.web.model.Requirement;
import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ReqCreate;

public interface RequirementService{

	List<Requirement> getRequirementByProjectId(final int id);
	
	Requirement getRequirementById(final int id);
	
	void createRequirement(ReqCreate requirement);
	
}
