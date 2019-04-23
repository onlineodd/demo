package com.chansofti.demo.api;

import java.util.Scanner;

public class StatisticsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		System.out.println(Statistics(string));
	}
	public static String Statistics(String string){
		char []s=string.toCharArray();
		String h = null;
		String[] d = null;
		int t=0,i;
		int count = 0;
		for ( i = 0; i < s.length; i++) {
			char s1=s[i];
			for (int j= 0; j < s.length; j++) {
				if(s[i]==s[j]){
				count++;
			}
			}
			
			t=count;
			h=s1+"-"+String.valueOf(t);
	
			count=0;
			System.out.println(h);
//			count=0;
			
		}
		return "";
		
		
	}
	

}
