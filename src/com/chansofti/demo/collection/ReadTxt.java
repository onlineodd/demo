package com.chansofti.demo.collection;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadTxt 
{

	public static  void main(String[] args)
	{
		// TODO Auto-generated method stub
		String tiseLine;
		try{
			List<User> list=new ArrayList<User>();
//			FileReader file=new FileReader("D://Users.txt");//读取文本数据方法1
//			BufferedReader buf=new BufferedReader(file);
			InputStreamReader in=new InputStreamReader(new FileInputStream("D://Users.txt"),"GBK");
			//处理中文乱码读取文件
			BufferedReader buf=new BufferedReader(in);
			//BufferedReader buf=new BufferedReader(new FileReader("D://Users.txt"));//读取文本数据方法2
			String name = null;
			
			Integer age=0;
			Integer height=0;
			while((tiseLine=buf.readLine())!=null)
			{
			String temp[] = tiseLine.split(",");//返回一个数组
			name=temp[0];
			age=Integer.valueOf(temp[1]);//字符串转数字
			height=Integer.valueOf(temp[2]);
			list.add(new User(name, age, height));
			
			
			}
			Collections.sort(list);
			for(User users:list)
			{
				System.out.println(users);
			}
			
		}catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}

class User implements Comparable<User>
{
	String name;
	int age;
	int height;
	public int getHeight() 
	{
		return height;
	}
	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	public User(String name, int age, int height)
	{
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString()
	{
		return "Persont [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	@Override
	public int compareTo(User o)
	{
		//进行排序
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	
}

