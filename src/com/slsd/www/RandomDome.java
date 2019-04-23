package com.slsd.www;


import java.util.Scanner;

import org.junit.experimental.theories.Theories;

public class RandomDome {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int count=0;
		Scanner cs=new Scanner(System.in);
		int sjs=(int)(Math.ceil(Math.random()*100));
		System.out.println("***************猜数游戏***************");
		System.out.println("请输入一个0-99的数：");
		long str=System.currentTimeMillis();//记录起始时间
		try {
	
			while(true){
				int r=cs.nextInt();
				count++;
				if(sjs==r){
					System.out.println("共用了"+count+"次答对了");
					System.out.println("用时"+(System.currentTimeMillis()-str)/1000+"秒");
					
					break;
				}else if(r>sjs){
					System.out.println("太大了");
					System.out.println("请继续游戏：");
					
				
				}else if(r<sjs){
					System.out.println("太小了");
					System.out.println("请继续游戏：");
				
				
				}
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
