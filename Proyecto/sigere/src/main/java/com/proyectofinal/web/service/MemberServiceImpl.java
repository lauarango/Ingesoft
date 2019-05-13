package com.proyectofinal.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.proyectofinal.web.dao.MemberDao;
import com.proyectofinal.web.model.Member;

public class MemberServiceImpl implements MemberService {
	
	@Autowired
	public MemberDao memberDao;
	
	public List<Member> getUsersByProjectId(int id){
		return memberDao.getUsersByProjectId(id);
	}

}
