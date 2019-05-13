package com.proyectofinal.web.model;

public class Member {
	private final int id;
	private final int userId;
	private final String role;
	private final int projectId;
	
	
	public Member(final int id,final int userId, final String role, final int projectId) {
		this.id = id;
		this.userId = userId;
		this.role = role; 
		this.projectId = projectId;
	}
	
	public int getId() {
		return id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getRole() {
		return role;
	}
	
	public int getProjectId() {
		return projectId;
	}
}
