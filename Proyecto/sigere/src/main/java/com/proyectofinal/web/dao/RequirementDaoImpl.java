package com.proyectofinal.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.ReqCreate;
import com.proyectofinal.web.model.Requirement;

public class RequirementDaoImpl implements RequirementDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	  
	@Override
	public List<Requirement> getRequirementByProjectId(int id) {
		String sql = "SELECT * FROM requirements INNER JOIN requirementsxproject ON(requirementsxproject.requirementid = requirements.id) WHERE projectid = '" + id + "'";
		return jdbcTemplate.query(sql, new RequirementMapper());
	}

	@Override
	public Requirement getRequirementById(int id) {
		String sql = "SELECT * FROM requirements WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new RequirementMapper()).get(0);
	}
	@Override
	public void createRequirement(ReqCreate requirement) {
		String sql = "insert into requirements(type, name, description, status) values(?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { requirement.getType(), requirement.getName(), requirement.getDescription(),requirement.getStatus()});
		
	}

	@Override
	public void linkRequirementWithProject(ReqCreate createdReq, Project project) {
		String sql = "SELECT * FROM requirements WHERE name = '" + createdReq.getName() + "'";
		final Requirement requirement = jdbcTemplate.query(sql, new RequirementMapper()).get(0);
		sql = "INSERT INTO requirementsxproject(projectId, requirementId) VALUES (?, ?)";
		jdbcTemplate.update(sql, new Object[] { project.getId(), requirement.getId()});
	}


}

class RequirementMapper implements RowMapper<Requirement> {

	@Override
	public Requirement mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Requirement(rs.getInt("id"), rs.getString("type"), rs.getString("name"), rs.getString("description"),rs.getString("status"));
	}
	
}