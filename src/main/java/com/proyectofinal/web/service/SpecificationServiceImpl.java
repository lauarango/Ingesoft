package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.SpecificationDao;
import com.proyectofinal.web.model.Specification;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email:lauarangom@gmail.com
 * Creation date: 26/04/2019
 * Last modification: 15/05/2019
 */
public class SpecificationServiceImpl implements SpecificationService {
	//Create a Specification Dao to access to its functions.
	@Autowired
	public SpecificationDao specificationDao;
	//Returns a list with the Specifications associated to a Requirement.
	@Override
	public List<Specification> getSpecificationByRequirementId(int id) {
		return specificationDao.getSpecificationByRequirementId(id);
	}
	//Returns a specification by its Id.
	@Override
	public Specification getSpecificationById(int id) {
		return specificationDao.getSpecificationById(id);
	}
}