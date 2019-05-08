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
		String sql = "SELECT * FROM requirements WHERE projectid = '" + id + "'";
		return jdbcTemplate.query(sql, new RequirementMapper());
	}

	@Override
	public Requirement getRequirementById(int id) {
		String sql = "SELECT * FROM requirements WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new RequirementMapper()).get(0);
	}
	@Override
	public void createRequirement(ReqCreate requirement) {
		String sql = "insert into requirements(reqId,type, name, description, status,version,projectId) values(?,?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { requirement.getReqId(),requirement.getType(), requirement.getName(), requirement.getDescription(),requirement.getStatus(), requirement.getVersion(), requirement.getProjectId()});
		
	}



}

class RequirementMapper implements RowMapper<Requirement> {

	@Override
	public Requirement mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Requirement(rs.getInt("id"), rs.getString("reqId"),rs.getString("type"), rs.getString("name"), rs.getString("version"),rs.getString("description"),rs.getString("status"),rs.getInt("projectId"));
	}
	
}