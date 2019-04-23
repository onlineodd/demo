package com.chansofti.demo.generictype;

public class GTDemo5 
{
	//泛型定义在方法上
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GTDemo5 gtDemo5=new GTDemo5();
		gtDemo5.show("asd");
		gtDemo5.show(1);
		gtDemo5.show(0.5);
	}
	//在返回值和访问控制符中间，加入泛型
		public<T> void show(T t)
		{
		System.out.println(t);
	
		}

}
