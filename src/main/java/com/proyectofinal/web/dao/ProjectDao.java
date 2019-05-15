package com.proyectofinal.web.dao;

import java.util.List;

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ProjectCreate;
import com.proyectofinal.web.model.User;
/**
 * Project:Sigere
 * Developer:Laura Arango, Verónica Tofiño
 * Contact email: lauarangom@gmail.com, veronicatofino@gmail.com
 * Creation date: 28/04/2019
 * Last modification: 15/05/2019
 */
public interface ProjectDao {
	//Returns all the Projects of a User
	List<Project> getProjectsByUserId(final int id);
	//Returns a Project from its id
	Project getProjectById(final int id);
	//Create a new project
	void createProject(ProjectCreate project);
	//Add a project to a User
	void linkProjectWithUser(final ProjectCreate project, final User user);

}
