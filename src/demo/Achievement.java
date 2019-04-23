package demo;

import java.util.Scanner;

public class Achievement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩：");
		Scanner ach=new Scanner(System.in);
		int num=ach.nextInt();
		if(num<60)
		{
		System.out.println("成绩不合格");	
		}else if(num>=60)
		{
			System.out.println("成绩合格");	
		}else if(num>=70)
		{
			System.out.println("中");
			
		}else if(num >=80)
		{
			System.out.println("良");	
		}else
		{
			System.out.println("优秀");	
		}
	}

}
