package com.chansofti.demo.lambda;

public class LambdaExampl02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdk8以上使用
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类来实现");
			}
		}).start();
		//jdk8以后使用lambda
		new Thread(()->System.out.println("使用Lambda来实现")).start();
	}

}
