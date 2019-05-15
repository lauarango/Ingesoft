package com.proyectofinal.web.dao;

import java.util.List;
import com.proyectofinal.web.model.Member;
/**
 * Project:Sigere
 * Developer:Laura Arango
 * Contact email: lauarangom@gmail.com
 * Creation date: 09/05/2019
 * Last modification: 15/05/2019
 */
public interface MemberDao {
	//Returns all the members of a project
	List<Member> getUsersByProjectId(int id);
}
