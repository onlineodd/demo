package demo;

import java.util.Scanner;

public class App3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		System.out.println("�������һ������");
		int a=sr.nextInt();
		System.out.println("������+������*��/��%��");
		String v=sr.next();
		System.out.println("������ڶ�������");
		int b=sr.nextInt();
		if("+".equals(v))
		{
		System.out.println("a+b="+a+b);
		}else if("-".equals(v))
		{
		System.out.println("a-b="+(a-b));
		}else if("*".equals(v))
		{
		System.out.println("a*b="+a*b);
		}else if("/".equals(v))
		{
			if(b==0)
			{
			System.out.println("��ĸ����Ϊ0");
			}
		
		else
		{
			
		System.out.println("a/b="+a/b);
		}
		}
		else if("%".equals(v))
		{
		System.out.println("a%b="+a%b);
		}
		
	}

}
