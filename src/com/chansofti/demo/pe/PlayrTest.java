package com.chansofti.demo.pe;

import java.util.Scanner;

public class PlayrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ѡ������ͣ�");
		Scanner scanner=new Scanner(System.in);
		String cn=scanner.next();
		Player mp3=new MyMp3();
		Player mp4=new MyMp4();
		Player mav=new MyMAV();
		if(cn.equals("mp3"))//equals()���������ж�����ģ������ַ��������뷽���Ĳ������Ƿ���ȡ�
		{
			mp3.play("mp3");
		}else if(cn.equals("mp4"))
		{
			mp4.play("mp4");
		}else 
		{
			mav.play("mav");
		}
	}

}
