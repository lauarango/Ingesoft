package com.proyectofinal.web.service;

import java.util.List;

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
public interface ProjectService {
	//Returns the projects of a user
	List<Project> getProjectsByUserId(final int id);
	//Returns the project by its id
	Project getProjectById(final int id);
	//Create a new project
	void createProject(ProjectCreate project); 
	//Associates a user to a project
	void linkProjectWithUser(final ProjectCreate project, final User user);
}
