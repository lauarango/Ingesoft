 package com.proyectofinal.web.model;

import java.sql.Date;

public class Specification{
	private final int id;
	private final String code;
	private final String name;
	private final Date date;
	private final int degreeofneed;
	private final String description;
	private final String entry;
	private final String font;
	private final String outt;
	private final String destiny;
	private final String restriction;
	private final String process;
	private final String colateraleffect;
	
	public Specification (final int id,final String code, final String name,final Date date, final int degreeofneed, final String description, final String entry,
			final String font, final String outt, final String destiny, final String restriction, final String process, final String colateraleffect) {
		this.id=id;
		this.code=code;
		this.name=name;
		this.date=date;
		this.degreeofneed=degreeofneed;
		this.description=description;
		this.entry=entry;
		this.font=font;
		this.outt=outt;
		this.destiny=destiny;
		this.restriction=restriction;
		this.process=process;
		this.colateraleffect=colateraleffect;
		
	}
	
	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getDate() {
		return date;
	}
	
	public int getDegreeOfNeed() {
		return degreeofneed;
	}

	public String getDescr() {
		return description;
	}
	
	public String getEntry() {
		return entry;
	}
	
	public String getFont() {
		return font;
	}
	
	public String getOut() {
		return outt;
	}
	
	public String getDestiny() {
		return destiny;
	}
	
	public String getRestriction() {
		return restriction;
	}
	
	public String getProcess() {
		return process;
	}
	
	public String getColateralEffect() {
		return colateraleffect;
	}
}


