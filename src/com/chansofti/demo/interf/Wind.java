package com.chansofti.demo.interf;

public class Wind implements Express
{

	@Override
	public void Pickup()
	{
		// TODO Auto-generated method stub
		System.out.println("正在接收顺丰快递");
		
	}

	@Override
	public void Sendingparts()
	{
		// TODO Auto-generated method stub
		System.out.println("正在发送顺丰快递");
	}

}
