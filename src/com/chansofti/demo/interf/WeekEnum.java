package com.chansofti.demo.interf;

public enum WeekEnum {//ö��
	SUNDAY("������"),MONDAY("����һ"),TUESDAY("���ڶ�"),WEDNESDAY("������"),THURSDAY("������"),FRIDAY("������"),SATURDAY("������");
	
	public String data ;
	private WeekEnum(String data)
	{
		this.data=data;
	}
	public String say(){
		return "�����ǣ�"+data;
	}
	
}
