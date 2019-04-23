package com.chansofti.demo;

public class Ssr {
	private String name;
	private int age;
	private String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	void Se(){
		System.out.println(name+""+age+""+sex);
	}
	
}
//父类的静态->子类的静态->父类的动态->父类的构造->子类的动态->子类的构造
