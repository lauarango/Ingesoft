package com.proyectofinal.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
public class ProjectDaoImpl implements ProjectDao {
	/**
	 * DataSource an JbdcTemplate are classes and interfaces from sql to generate querys.
	 */
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	//Implementation of the getProjectsByUserId function definite in ProjectDao.java
	@Override
	public List<Project> getProjectsByUserId(int id) {
		String sql = "SELECT * FROM projects INNER JOIN projectsxuser ON(projectsxuser.projectId = projects.id) WHERE userId = '" + id + "'";
		return jdbcTemplate.query(sql, new ProjectMapper());
		
	}
    //Implementation of the getProjectById function definite in ProjectDao.java
	@Override
	public Project getProjectById(int id) {
		String sql = "SELECT * FROM projects WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new ProjectMapper()).get(0);
	}
    //Implementation of the createProject function definite in ProjectDao.java
	@Override
	public void createProject(ProjectCreate project) {
		String sql = "insert into projects(name, description,contextDiagram) values(?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { project.getName(), project.getDescription(), project.getContextDiagram()});
		
	}
    //Implementation of the linkProjectWithUser function definite in ProjectDao.java
	@Override
	public void linkProjectWithUser(ProjectCreate createdProject, User user) {
		String sql = "SELECT * FROM projects WHERE name = '" + createdProject.getName() + "'";
		final Project project = jdbcTemplate.query(sql, new ProjectMapper()).get(0);
		sql = "INSERT INTO projectsxuser(userId, projectId) VALUES (?, ?)";
	    jdbcTemplate.update(sql, new Object[] { user.getId(), project.getId()});
	}

}
//The mapper is to create a new object of the class.
class ProjectMapper implements RowMapper<Project> {

	@Override
	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Project(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getBlob("contextDiagram"));
	}
	
}