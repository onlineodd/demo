package demo;

import java.util.Scanner;

public class HelloName 
{
	public static void main(String[] avgs)
	{
		//��ʾ�û�����
		//�ַ�����ƴ��
		//Scanner����
		System.out.println("������������֣�");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		System.out.println("Hello"+name);
		System.out.printf("Hello", name);
	}
	
}
