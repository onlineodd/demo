package com.chansofti.demo.api;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(new Date(10*24*60*60*1000));
		System.out.println(new Date(System.currentTimeMillis()));
		//日历
		Calendar now =Calendar.getInstance();
		Date date2=now.getTime();
		System.out.println(date2);
		Calendar tomorrowCalendar=Calendar.getInstance();
		//月份按0开始
		tomorrowCalendar.set(2019, 4, 3, 8, 10, 10);
		date2=tomorrowCalendar.getTime();
		System.out.println(date2);
		tomorrowCalendar.set(2012, 11, 21);
		tomorrowCalendar.add(Calendar.YEAR, 8);
		tomorrowCalendar.add(Calendar.MONTH, 2);
		date2=tomorrowCalendar.getTime();
		System.out.println(date2);
		//格式化日期
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E F W w u");
		String datesString=simpleDateFormat.format(date);
		System.out.println(datesString);
		//把字符串格式化为日期，提供的各式和字符串的格式一致
//		String dString="2020-10-10";
//		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("yyyy/MM/dd");
//		Date date3=simpleDateFormat2.parse(dString);
//		System.out.println(date3);
		
		//locaDate
		LocalDate now2 = LocalDate.now();
		System.out.println(now2);
		System.out.println(now2.getYear());
		System.out.println(now2.getMonthValue());
		System.out.println(now2.getDayOfMonth());
		
		String dString2="2020-10-10";
		LocalDate date4=LocalDate.parse(dString2);
		System.out.println(date4);
		//14:35:01.415
		System.out.println(LocalDateTime.now());
		//LocaDateTime
		LocalDateTime localDateTime=LocalDateTime.of(2019, 04,03,12,23,4);
		//
		System.out.println(localDateTime);
		//DateTimeFormater->LocaDate->LocaTime->LocalDateTime
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		LocalDate nowDate=LocalDate.now();
		String string=nowDate.format(dateTimeFormatter);
		System.out.println(string);
	}

}
