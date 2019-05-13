package com.proyectofinal.web.service;

import java.util.List;

import com.proyectofinal.web.model.Project;
import com.proyectofinal.web.model.Member;

public interface MemberService {
	
	List<Member> getUsersByProjectId(final int id);
}
