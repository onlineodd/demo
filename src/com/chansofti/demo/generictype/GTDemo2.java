package com.chansofti.demo.generictype;


public class GTDemo2
{
	//持有用户的一个String对象
	//能够提供打印该String对象
	private String myString;

	public String getMyString()
	{
		return myString;
	}

	public void setMyString(String myString) 
	{
		this.myString = myString;
	}

	public GTDemo2(String myString) 
	{
		super();
		this.myString = myString;
	}
	public void show()
	{
		System.out.println(myString);
	}
	public static void main(String[] args) 
	{
			GTDemo2 gtDemo2=new GTDemo2("abc");
			gtDemo2.show();
	}
}
