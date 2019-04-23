package com.chansofti.demo.exception;

import java.util.Scanner;

public abstract class ThrowDemo 
{
	public static void main(String[] args) throws Exception
	{
		
		//throw new Exception("你好坏哦，我好喜欢！");
		//throw抛出错误
		System.out.println("请输入年龄：");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		if(age<18){
		throw new Exception("你还小，还没到18岁！");
		}else {
			System.out.println("你可以参加！");
		}
		}
}
