package demo;

import java.util.Scanner;

public class HelloName 
{
	public static void main(String[] avgs)
	{
		//提示用户输入
		//字符串的拼接
		//Scanner输入
		System.out.println("请输入你的名字：");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Hello"+name);
		System.out.printf("Hello", name);
	}
	
}
