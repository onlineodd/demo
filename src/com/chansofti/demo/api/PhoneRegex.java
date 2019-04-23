package com.chansofti.demo.api;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex="^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
		Pattern pattern=Pattern.compile(regex);
		Scanner sjh=new Scanner(System.in);
		String phoneNumbers=sjh.next();
		
			Matcher matcher=pattern.matcher(phoneNumbers);
			boolean flag=matcher.matches();
			if(flag){
			System.out.println(phoneNumbers+"是手机号码");
		
		}else{
			System.out.println(phoneNumbers+"不是手机号码");
		}
		}
	}


