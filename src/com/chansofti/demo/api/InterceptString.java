package com.chansofti.demo.api;

import java.util.Scanner;

public class InterceptString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String ag=scanner.next();
		int st=scanner.nextInt();
		System.out.println(InterceptString(ag, st));
	}
	public static String InterceptString(String string,int ss){
		int s = 0;
		for(int i=0;i<string.length();i++){
			if(string=="^[\u4e00-\u9fa5]{0,10}"){
				s=string.length()+1;
			}else{
				s=string.length();
			}
		}
		if(ss==s){
			string=string.substring(0, ss-1);
		}
		if(ss<s){
			string=string.substring(0, ss-2);
		}
		return string;
	}

}
