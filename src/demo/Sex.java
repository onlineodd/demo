package demo;

import java.util.Scanner;

public class Sex
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("请输入1-3：");
		Scanner sex = new Scanner(System.in);
		int s = sex.nextInt();
		switch (s)
		{
		case 1:
			System.out.println("女");
			break;
		case 2:
			System.out.println("男");
			break;
		case 3:
			System.out.println("不男不女");
			break;
		}
	}

}
