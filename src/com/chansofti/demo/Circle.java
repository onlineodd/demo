package com.chansofti.demo;

public class Circle extends Shape {

	@Override
	public void Circumference() {
		// TODO Auto-generated method stub
		System.out.println("Բ�ε��ܳ�"+2*radius*Math.PI);

	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Բ�ε��ܳ�"+Math.pow(radius, 2)*Math.PI);

	}

}
