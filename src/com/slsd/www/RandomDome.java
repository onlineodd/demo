package com.slsd.www;


import java.util.Scanner;

import org.junit.experimental.theories.Theories;

public class RandomDome {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int count=0;
		Scanner cs=new Scanner(System.in);
		int sjs=(int)(Math.ceil(Math.random()*100));
		System.out.println("***************������Ϸ***************");
		System.out.println("������һ��0-99������");
		long str=System.currentTimeMillis();//��¼��ʼʱ��
		try {
	
			while(true){
				int r=cs.nextInt();
				count++;
				if(sjs==r){
					System.out.println("������"+count+"�δ����");
					System.out.println("��ʱ"+(System.currentTimeMillis()-str)/1000+"��");
					
					break;
				}else if(r>sjs){
					System.out.println("̫����");
					System.out.println("�������Ϸ��");
					
				
				}else if(r<sjs){
					System.out.println("̫С��");
					System.out.println("�������Ϸ��");
				
				
				}
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
