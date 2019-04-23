package com.slsd.www;

import java.io.Serializable;
import java.util.List;

public class MyClass implements Serializable {
	private String cName;
	private List <Student> banj;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Student> getBanj() {
		return banj;
	}
	public void setBanj(List<Student> banj) {
		this.banj = banj;
	}
	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyClass(String cName, List<Student> banj) {
		super();
		this.cName = cName;
		this.banj = banj;
	}
	@Override
	public String toString() {
		return "MyClass [cName=" + cName + ", banj=" + banj + "]";
	}


}
