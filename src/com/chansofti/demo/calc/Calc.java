package com.chansofti.demo.calc;

public abstract class Calc {
	public int num1;
	public int num2;
	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public abstract int  calculator();
	
	

}
