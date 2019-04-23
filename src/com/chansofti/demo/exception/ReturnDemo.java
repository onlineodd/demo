package com.chansofti.demo.exception;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReturnDemo().foo());
	}
public int foo(){
	try{
		System.out.println(100/0);
		return 1;
	}catch (Exception e) {
		// TODO: handle exception
		return 2;
	}finally {
		return 3;
	}
}
}
