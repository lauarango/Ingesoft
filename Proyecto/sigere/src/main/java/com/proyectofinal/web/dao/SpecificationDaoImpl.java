package com.proyectofinal.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyectofinal.web.model.Specification;

public class SpecificationDaoImpl implements SpecificationDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	  
	@Override
	public List<Specification> getSpecificationByRequirementId(int id) {
		String sql = "SELECT * FROM specifications INNER JOIN specificationsxrequirement ON(specificationsxrequirement.specificationId = specifications.id) WHERE requirementId = '" + id + "'";
		return jdbcTemplate.query(sql, new SpecificationMapper());
	}

	@Override
	public Specification getSpecificationById(int id) {
		String sql = "SELECT * FROM specifications WHERE id = '" + id + "'";
		return jdbcTemplate.query(sql, new SpecificationMapper()).get(0);
	}


}

class SpecificationMapper implements RowMapper<Specification> {

	@Override
	public Specification mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Specification(rs.getInt("id"), rs.getString("code"), rs.getString("name"),rs.getDate("date"),rs.getInt("degreeofneed") ,rs.getString("description"),rs.getString("entry"),rs.getString("font"),rs.getString("outt"),rs.getString("destiny"),rs.getString("restriction"),rs.getString("process"),rs.getString("colateraleffect"));
	}
	
}