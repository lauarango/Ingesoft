package com.proyectofinal.web.model;

public class ReqCreate {
	
	private String reqId;
	private String type;
	private String name;
	private String version;
	private String description;
	private String status;
	private int projectId;
	
	public ReqCreate(final String reqId,final String type, final String name, final String version, final String description,final String status, final int projectId) {
		this.reqId=reqId;
		this.type = type;
		this.name = name;
		this.version=version;
		this.description = description;
		this.status = status;
		this.projectId=projectId;
	}
	
	
	public ReqCreate() {
		
	}
	
	public void setReqId(final String reqId) {
		this.reqId=reqId;
	}
	
	public String getReqId() {
		return reqId;
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
	
	public void setVersion(final String version) {
		this.version=version;
	}
	
	public String getVersion() {
		return version;
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
	
	
	
	public void setProjectId( final int projectId) {
		this.projectId=projectId;
	}
	
	public int getProjectId() {
		return projectId;
	}
}
