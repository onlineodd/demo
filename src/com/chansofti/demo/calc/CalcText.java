package com.chansofti.demo.calc;

import java.util.Scanner;

public class CalcText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入第一个数：");
		 int a=scanner.nextInt();
		 System.out.println("输入第二个数：");
		 int b=scanner.nextInt();
		 System.out.println("请输入操作符：");
		 String op=scanner.next();
		 
		 Calc calc = CalcFactory.createCalc(a, b, op);//把参数传入工厂类中
		 System.out.println("a"+op+"b="+calc.calculator());
	}

}
