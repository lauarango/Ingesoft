package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.RequirementDao;
import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ReqCreate;
import com.proyectofinal.web.model.Requirement;

public class RequirementServiceImpl implements RequirementService {

	@Autowired
	public RequirementDao requirementDao;
	
	@Override
	public List<Requirement> getRequirementByProjectId(int id) {
		return requirementDao.getRequirementByProjectId(id);
	}

	@Override
	public Requirement getRequirementById(int id) {
		return requirementDao.getRequirementById(id);
	}
	
	@Override
	public void createRequirement(ReqCreate requirement) {
		requirementDao.createRequirement(requirement);
	}
	

	

}