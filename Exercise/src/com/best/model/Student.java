package com.best.model;

public class Student {
	private int id;
	private String name;
	private int age;
	private String nrc;
	private String phno;
	private int classId;
	private String className;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Student() {
		
	}
	public Student(int id,String name, int age, String nrc, String phno, int classId,String className) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.nrc = nrc;
		this.phno = phno;
		this.classId=classId;
		this.className=className;
	}
	

}
