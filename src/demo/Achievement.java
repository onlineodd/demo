package demo;

import java.util.Scanner;

public class Achievement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ɼ���");
		Scanner ach=new Scanner(System.in);
		int num=ach.nextInt();
		if(num<60)
		{
		System.out.println("�ɼ����ϸ�");	
		}else if(num>=60)
		{
			System.out.println("�ɼ��ϸ�");	
		}else if(num>=70)
		{
			System.out.println("��");
			
		}else if(num >=80)
		{
			System.out.println("��");	
		}else
		{
			System.out.println("����");	
		}
	}

}
