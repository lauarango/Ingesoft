package com.proyectofinal.web.service;

import java.util.List;

import com.proyectofinal.web.model.Specification;

public interface SpecificationService{

	List<Specification> getSpecificationByRequirementId(final int id);
	
	Specification getSpecificationById(final int id);
	

}