package com.chansofti.demo.api;

public class Same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abegad";
		String s2="acegab";
		sop(getMaxSubString(s1,s2));
	}
	public static String getMaxSubString(String s1,String s2)
	{
		String max,min;
		max = (s1.length()>s2.length())?s1:s2;
		min = (max==s1)?s2:s1;
		for(int i=0;i<min.length();i++)
		{
			for(int j=0,k=min.length()-i;k!=min.length()+1;j++,k++)
			{
				String temp = min.substring(j,k);//索引开始位置和结束位置
				if(max.contains(temp))//contains判断是否存在包含关系
					return temp;
			}
		}
		return min ;
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}



