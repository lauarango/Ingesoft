package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.MemberDao;
import com.proyectofinal.web.model.Member;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 09/05/2019
 * Last modification: 15/05/2019
 */
public class MemberServiceImpl implements MemberService {
	//Create a Member Dao to access to its functions.
	@Autowired
	public MemberDao memberDao;
	//Returns a list of the users of a project,
	public List<Member> getUsersByProjectId(int id){
		return memberDao.getUsersByProjectId(id);
	}

}
