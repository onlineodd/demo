package com.chansofti.demo;

public class Birds {
	public String name;
	
	public void Move(){
		System.out.println(name+"Fly");
	}
public static void main(String[] args) {
	Birds birds=new Peng();
	birds.Move();
	Birds birds2=new Ostrich();
	birds2.Move();
}
}
