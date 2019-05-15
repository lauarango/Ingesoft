package com.proyectofinal.web.service;

import java.util.List;

import com.proyectofinal.web.model.Member;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 09/05/2019
 * Last modification: 15/05/2019
 */
public interface MemberService {
	//Returns the Users associates to a Project.
	List<Member> getUsersByProjectId(final int id);
}
