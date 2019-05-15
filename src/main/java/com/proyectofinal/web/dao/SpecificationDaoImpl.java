package com.proyectofinal.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyectofinal.web.model.Specification;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 14/05/2019
 * Last modification: 15/05/2019
 */
public class SpecificationDaoImpl implements SpecificationDao {
	/**
	 * DataSource an JbdcTemplate are classes and interfaces from sql to generate querys.
	 */
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	//Implementation of the getSpecificationByRequirementId function definite in SpecificationDao.java  
	@Override
	public List<Specification> getSpecificationByRequirementId(int id) {
		String sql = "SELECT * FROM specifications WHERE requirementId = '" + id + "'";
		return jdbcTemplate.query(sql, new SpecificationMapper());
	}
	//Implementation of the getSpecificationById function definite in SpecificationDao.java  
	@Override
	public Specification getSpecificationById(int id) {
		String sql = "SELECT * FROM specifications WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new SpecificationMapper()).get(0);
	}


}
//The mapper is to create a new object of the class.
class SpecificationMapper implements RowMapper<Specification> {

	@Override
	public Specification mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Specification(rs.getInt("id"), rs.getString("code"), rs.getString("name"),rs.getDate("date"),rs.getInt("degreeOfNeed") ,rs.getString("description"),rs.getString("entry"),rs.getString("font"),rs.getString("outt"),rs.getString("destiny"),rs.getString("restriction"),rs.getString("process"),rs.getString("colateralEffect"),rs.getInt("requirementId"));
	}
	
}