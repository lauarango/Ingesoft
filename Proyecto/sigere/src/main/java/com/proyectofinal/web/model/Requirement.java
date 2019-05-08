package com.proyectofinal.web.model;

public class Requirement{
	private final int id;
	private final String reqId;
	private final String type;
	private final String name;
	private final String version;
	private final String description;
	private final String status;
	private final int projectId;
	
	public Requirement (final int id,final String reqId,final String type, final String name, final String version,final String description, final String status, final int projectId) {
		this.id=id;
		this.reqId=reqId;
		this.type=type;
		this.name=name;
		this.version=version;
		this.description=description;
		this.status=status;
		this.projectId=projectId;
	}
	
	public int getId() {
		return id;
	}

	public String getReqId() {
		return reqId;
	}
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}
	
	public String getDescr() {
		return description;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int getProjectId() {
		return projectId;
	}
}


