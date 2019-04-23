package com.chansofti.demo.thread.sync;

public class OriPerson extends Person {

	@Override
	synchronized void change(String name, String sex) {
		// TODO Auto-generated method stub
		super.name=name;
		try {
			Thread.sleep(50);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		super.sex=sex;
		
		
	}

	@Override
	synchronized String display() {
		// TODO Auto-generated method stub
		return "名字是"+super.name+",性别"+super.sex;
	}
	public OriPerson(String name,String sex){
		super.name=name;
		super.sex=sex;
	}

}
