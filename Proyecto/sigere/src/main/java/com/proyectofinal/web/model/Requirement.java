package com.proyectofinal.web.model;

public class Requirement{
	private final int id;
	private final String type;
	private final String name;
	private final String description;
	private final String status;
	
	public Requirement (final int id,final String type, final String description,final String name, final String status) {
		this.id=id;
		this.type=type;
		this.name=name;
		this.description=description;
		this.status=status;
	}
	
	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}

	public String getDescr() {
		return description;
	}
	
	public String getStatus() {
		return status;
	}
}


