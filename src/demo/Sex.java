package demo;

import java.util.Scanner;

public class Sex
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("������1-3��");
		Scanner sex = new Scanner(System.in);
		int s = sex.nextInt();
		switch (s)
		{
		case 1:
			System.out.println("Ů");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("���в�Ů");
			break;
		}
	}

}
