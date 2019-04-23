package demo;

import java.util.Scanner;

public class App3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a=sr.nextInt();
		System.out.println("请输入+，—，*，/，%：");
		String v=sr.next();
		System.out.println("请输入第二个数：");
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
			System.out.println("分母不能为0");
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
