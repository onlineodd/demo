package com.chansofti.demo.interf;

public enum WeekEnum {//枚举
	SUNDAY("星期天"),MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六");
	
	public String data ;
	private WeekEnum(String data)
	{
		this.data=data;
	}
	public String say(){
		return "今天是："+data;
	}
	
}
