package com.proyectofinal.web.dao;

import java.util.List;
import com.proyectofinal.web.model.Member;

public interface MemberDao {
	List<Member> getUsersByProjectId(int id);
}
