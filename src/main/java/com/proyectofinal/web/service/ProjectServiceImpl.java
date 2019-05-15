package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.ProjectDao;
import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ProjectCreate;
import com.proyectofinal.web.model.User;
/**
 * Project:Sigere
 * Developer:Verónica Tofiño
 * Contact email: veronicatofino@gmail.com
 * Creation date: 28/04/2019
 * Last modification: 15/05/2019
 */
public class ProjectServiceImpl implements ProjectService {
	//Create a Project Dao to access to it functions.
	@Autowired
	public ProjectDao projectDao;
	//Returns a list of the projects of a user.
	@Override
	public List<Project> getProjectsByUserId(int id) {
		return projectDao.getProjectsByUserId(id);
	}
	//Returns a project by its id.
	@Override
	public Project getProjectById(int id) {
		return projectDao.getProjectById(id);
	}
	//Create a new project.
	@Override
	public void createProject(ProjectCreate project) {
		projectDao.createProject(project);
	}

	@Override
	public void linkProjectWithUser(ProjectCreate project, User user) {
		projectDao.linkProjectWithUser(project, user);
	}

}
