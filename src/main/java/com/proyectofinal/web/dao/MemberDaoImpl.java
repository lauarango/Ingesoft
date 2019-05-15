package com.proyectofinal.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.proyectofinal.web.model.Member;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 09/05/2019
 * Last modification: 15/05/2019
 */
public class MemberDaoImpl implements MemberDao {
	/**
	 * DataSource an JbdcTemplate are classes and interfaces from sql to generate querys.
	 */
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;
	//Implementation of the getUsersByProjectId function definite in MemberDao.java  
	@Override
	public List<Member> getUsersByProjectId(int id){
		String sql = "SELECT * FROM projectsxuser INNER JOIN users ON(projectsxuser.userId = users.id) WHERE projectId = '" + id + "'";
		return jdbcTemplate.query(sql, new MemberMapper());
	}
}
//The mapper is to create a new object of the class.
class MemberMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Member(rs.getInt("id"), rs.getInt("userId"),rs.getString("role"),rs.getInt("projectId"));
	}
	
}
