package com.best.model;

public class Classes {
	private int id;
	private String cname;
	private String tname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public Classes() {
		
	}
	public Classes(int id, String cname, String tname) {
		super();
		this.id = id;
		this.cname = cname;
		this.tname = tname;
	}

}
