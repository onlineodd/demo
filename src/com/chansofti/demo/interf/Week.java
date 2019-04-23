package com.chansofti.demo.interf;

public class Week {
	public static void main(String[] args) {
		Week week=new Week();
		week.change();
		// compareTo()：用于比较两个枚举类型对象定义是的顺序
		System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.MONDAY));
		System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SUNDAY));
		System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SATURDAY));
		//ordinal获得枚举常量对象
		System.out.println(WeekEnum.SUNDAY.ordinal());
		System.out.println(WeekEnum.MONDAY.ordinal());
		System.out.println(WeekEnum.FRIDAY.ordinal());
		System.out.println(WeekEnum.MONDAY.say());
		System.out.println(OperatorEnum.PLUS.calculate(3, 5));
		System.out.println(OperatorEnum.MULTI.calculate(3, 7));
	}
WeekEnum weekEnum=WeekEnum.MONDAY;
public void change(){
	switch (weekEnum) {
	case MONDAY:
		weekEnum=WeekEnum.MONDAY;
		System.out.println("星期一你好！");
		break;
	case TUESDAY:
		weekEnum=WeekEnum.TUESDAY;
		System.out.println("星期二你好！");
		break;
	case WEDNESDAY:
		weekEnum=WeekEnum.WEDNESDAY;
		System.out.println("星期三你好！");
		break;
	case THURSDAY:
		weekEnum=WeekEnum.THURSDAY;
		System.out.println("星期四你好！");
		break;
	case FRIDAY:
		weekEnum=WeekEnum.FRIDAY;
		System.out.println("星期五你好！");
		break;
	case SATURDAY:
		weekEnum=WeekEnum.SATURDAY;
		System.out.println("星期六你好！");
		break;
	case SUNDAY:
		System.out.println("星期天你好！");
		break;
	

	}
}

}
