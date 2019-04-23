package com.chansofti.demo.pe;

public interface TanKInterface extends Vehicle,Weapon
{
	default  void foo()
		{
		System.out.println("这是接口的默认方法！");
		}
}
