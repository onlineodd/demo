package com.chansofti.demo.pe;

public interface TanKInterface extends Vehicle,Weapon
{
	default  void foo()
		{
		System.out.println("���ǽӿڵ�Ĭ�Ϸ�����");
		}
}
