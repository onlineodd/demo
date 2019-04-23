package com.chansofti.demo.api;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="ttt5yjd-jdd4yh";
		String s2="Hsdkf4sd-fsd3tr";
		String s3="sf5sd-dsd4wr";	
		System.out.println(Str(s1));
		System.out.println(Str(s2));
		System.out.println(Str(s3));
}
	public static String Str(String s){
		int t;
		String x = "";
		s=s.replace("-", "@");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				t=Integer.valueOf((String) s.subSequence(i,i+1));
				for(int j=0;j<t;j++) 
				{
					x+=s.subSequence(i+1, i+2);
				
				}
			s=s.replace(s.subSequence(i,i+2), x);
			x="";
			
			}
		
		}
		
		return s;
	}
}
