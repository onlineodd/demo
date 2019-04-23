package com.chansofti.demo.generictype;

public class GTDemo3 
{
	private Integer ageInteger;
 
	public GTDemo3(Integer ageInteger)
	{
	super();
	this.ageInteger = ageInteger;
	}

	public Integer getAgeInteger()
	{
	return ageInteger;
	}

	public void setAgeInteger(Integer ageInteger)
	{
	this.ageInteger = ageInteger;
	}
	public void show()
	{
	System.out.println(ageInteger);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		GTDemo3 gtDemo3=new GTDemo3(20);
		gtDemo3.show();
	}

}
