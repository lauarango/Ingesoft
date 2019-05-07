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

public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	  
	@Override
	public List<Project> getProjectsByUserId(int id) {
		String sql = "SELECT * FROM projects INNER JOIN projectsxuser ON(projectsxuser.projectId = projects.id) WHERE userId = '" + id + "'";
		return jdbcTemplate.query(sql, new ProjectMapper());
		
	}

	@Override
	public Project getProjectById(int id) {
		String sql = "SELECT * FROM projects WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new ProjectMapper()).get(0);
	}

	@Override
	public void createProject(ProjectCreate project) {
		String sql = "insert into projects(name, description,contextDiagram) values(?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { project.getName(), project.getDescription(), project.getContextDiagram()});
		
	}

	@Override
	public void linkProjectWithUser(ProjectCreate createdProject, User user) {
		String sql = "SELECT * FROM projects WHERE name = '" + createdProject.getName() + "'";
		final Project project = jdbcTemplate.query(sql, new ProjectMapper()).get(0);
		sql = "INSERT INTO projectsxuser(userId, projectId) VALUES (?, ?)";
	    jdbcTemplate.update(sql, new Object[] { user.getId(), project.getId()});
	}

}

class ProjectMapper implements RowMapper<Project> {

	@Override
	public Project mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Project(rs.getInt("id"), rs.getString("name"), rs.getString("description"), rs.getBlob("contextDiagram"));
	}
	
}