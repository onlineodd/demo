package com.chansofti.demo.lambda;

public class LambdaExampl02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdk8����ʹ��
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ�����ʵ��");
			}
		}).start();
		//jdk8�Ժ�ʹ��lambda
		new Thread(()->System.out.println("ʹ��Lambda��ʵ��")).start();
	}

}
