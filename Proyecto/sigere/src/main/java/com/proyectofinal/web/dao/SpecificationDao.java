package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Specification;

public interface SpecificationDao {

	List<Specification> getSpecificationByRequirementId(final int id);
	
	Specification getSpecificationById(final int id);
	
}