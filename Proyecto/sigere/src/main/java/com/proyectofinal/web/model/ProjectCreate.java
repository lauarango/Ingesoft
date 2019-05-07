package com.proyectofinal.web.model;

import java.sql.Blob;

import org.springframework.web.multipart.MultipartFile;

public class ProjectCreate {

	private String name;
	private String description;
	private MultipartFile contextDiagram;
	
	public ProjectCreate(final String name, final String description, final MultipartFile contextDiagram) {
		this.name = name;
		this.description = description;
		this.contextDiagram = contextDiagram;
	}
	
	public ProjectCreate() {
		
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
	
	public void setContextDiagrama (final MultipartFile contextDiagram) {
		this.contextDiagram=contextDiagram;
	}
	
	public MultipartFile getContextDiagram () {
		return contextDiagram;
	}
}
