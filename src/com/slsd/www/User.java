package com.slsd.www;

public class User {
	public String name;
	public String ageString;
	public String ss;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgeString() {
		return ageString;
	}
	public void setAgeString(String ageString) {
		this.ageString = ageString;
	}
	public String getSs() {
		return ss;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}
	public User(String name, String ageString, String ss) {
		super();
		this.name = name;
		this.ageString = ageString;
		this.ss = ss;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", ageString=" + ageString + ", ss=" + ss + "]";
	}
	

	
}
