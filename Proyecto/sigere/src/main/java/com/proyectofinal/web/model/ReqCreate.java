package com.proyectofinal.web.model;

public class ReqCreate {
	
	private String type;
	private String name;
	private String description;
	private String status;
	
	public ReqCreate(final String type, final String name, final String description,final String status) {
		this.type = type;
		this.name = name;
		this.description = description;
		this.status = status;
	}
	public ReqCreate setProjectId(int id) {
		return this;
	}
	
	public ReqCreate() {
		
	}
	
	public void setType(final String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(final String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setStatus(final String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
