package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.SpecificationDao;
import com.proyectofinal.web.model.Specification;

public class SpecificationServiceImpl implements SpecificationService {

	@Autowired
	public SpecificationDao specificationDao;
	
	@Override
	public List<Specification> getSpecificationByRequirementId(int id) {
		return specificationDao.getSpecificationByRequirementId(id);
	}

	@Override
	public Specification getSpecificationById(int id) {
		return specificationDao.getSpecificationById(id);
	}
}