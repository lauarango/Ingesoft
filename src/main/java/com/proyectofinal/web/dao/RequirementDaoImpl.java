package com.proyectofinal.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyectofinal.web.model.ReqCreate;
import com.proyectofinal.web.model.Requirement;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 30/04/2019
 * Last modification: 15/05/2019
 */
public class RequirementDaoImpl implements RequirementDao {
	/**
	 * DataSource an JbdcTemplate are classes and interfaces from sql to generate querys.
	 */
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	//Implementation of the getRequirementByProjectId function definite in RequirementDao.java  
	@Override
	public List<Requirement> getRequirementByProjectId(int id) {
		String sql = "SELECT * FROM requirements WHERE projectid = '" + id + "'";
		return jdbcTemplate.query(sql, new RequirementMapper());
	}
	//Implementation of the getRequirementById function definite in RequirementDao.java
	@Override
	public Requirement getRequirementById(int id) {
		String sql = "SELECT * FROM requirements WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new RequirementMapper()).get(0);
	}
	//Implementation of the createRequirement function definite in RequirementDao.java
	@Override
	public void createRequirement(ReqCreate requirement) {
		String sql = "insert into requirements(reqId,type, name, description, status,version,projectId) values(?,?,?,?,?,?,?)";
	    jdbcTemplate.update(sql, new Object[] { requirement.getReqId(),requirement.getType(), requirement.getName(), requirement.getDescription(),requirement.getStatus(), requirement.getVersion(), requirement.getProjectId()});
		
	}



}
//The mapper is to create a new object of the class.
class RequirementMapper implements RowMapper<Requirement> {

	@Override
	public Requirement mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Requirement(rs.getInt("id"), rs.getString("reqId"),rs.getString("type"), rs.getString("name"), rs.getString("version"),rs.getString("description"),rs.getString("status"),rs.getInt("projectId"));
	}
	
}