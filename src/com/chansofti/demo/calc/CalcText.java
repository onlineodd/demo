package com.chansofti.demo.calc;

import java.util.Scanner;

public class CalcText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����һ������");
		 int a=scanner.nextInt();
		 System.out.println("����ڶ�������");
		 int b=scanner.nextInt();
		 System.out.println("�������������");
		 String op=scanner.next();
		 
		 Calc calc = CalcFactory.createCalc(a, b, op);//�Ѳ������빤������
		 System.out.println("a"+op+"b="+calc.calculator());
	}

}
