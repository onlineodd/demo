package com.chansofti.demo.exception;

import java.util.Scanner;

public abstract class ThrowDemo 
{
	public static void main(String[] args) throws Exception
	{
		
		//throw new Exception("��û�Ŷ���Һ�ϲ����");
		//throw�׳�����
		System.out.println("���������䣺");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		if(age<18){
		throw new Exception("�㻹С����û��18�꣡");
		}else {
			System.out.println("����Բμӣ�");
		}
		}
}
