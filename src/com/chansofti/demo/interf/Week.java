package com.chansofti.demo.interf;

public class Week {
	public static void main(String[] args) {
		Week week=new Week();
		week.change();
		// compareTo()�����ڱȽ�����ö�����Ͷ������ǵ�˳��
		System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.MONDAY));
		System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SUNDAY));
		System.out.println(WeekEnum.FRIDAY.compareTo(WeekEnum.SATURDAY));
		//ordinal���ö�ٳ�������
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
		System.out.println("����һ��ã�");
		break;
	case TUESDAY:
		weekEnum=WeekEnum.TUESDAY;
		System.out.println("���ڶ���ã�");
		break;
	case WEDNESDAY:
		weekEnum=WeekEnum.WEDNESDAY;
		System.out.println("��������ã�");
		break;
	case THURSDAY:
		weekEnum=WeekEnum.THURSDAY;
		System.out.println("��������ã�");
		break;
	case FRIDAY:
		weekEnum=WeekEnum.FRIDAY;
		System.out.println("��������ã�");
		break;
	case SATURDAY:
		weekEnum=WeekEnum.SATURDAY;
		System.out.println("��������ã�");
		break;
	case SUNDAY:
		System.out.println("��������ã�");
		break;
	

	}
}

}
