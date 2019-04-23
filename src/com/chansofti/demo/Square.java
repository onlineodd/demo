package com.chansofti.demo;

public class Square extends Shape {

	@Override
	public void Circumference() {
		// TODO Auto-generated method stub
		System.out.println("正方形的周长："+(num1+num2)*2);

	}

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("正方形的面积："+num1*num2);

	}

}
