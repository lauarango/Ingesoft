package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ProjectCreate;
import com.proyectofinal.web.model.User;

public interface ProjectDao {

	List<Project> getProjectsByUserId(final int id);
	
	Project getProjectById(final int id);
	
	void createProject(ProjectCreate project);
	
	void linkProjectWithUser(final ProjectCreate project, final User user);

}
