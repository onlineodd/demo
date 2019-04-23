package com.chansofti.demo.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdk8��ӵ�һ���µĳ��󣬳�ΪStream������������һ����ʽ�ķ�ʽ��������ݽ��д���
		//stream������ʽ
		//map������е�ÿһ��Ԫ��
		List<Integer> nums=Arrays.asList(100,200,300,400,500);
		nums.stream().map((num)->num*1.12).forEach(System.out::println);
		for(Integer integer:nums){
			double r=integer*1.12;
			System.out.println(r);
		}
		
		//��ȡ��Ӧ���ݵ�ƽ������ȥ�أ��������ռ����б�
		//distinctȥ��
		//collect�ռ����б�
		List<Integer> nums2=Arrays.asList(3,2,2,3,7,3,5);
		List<Integer> collect=nums2.stream().map((x)->x*x).distinct().collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		//filter���ڹ���
		//��Ը������ַ����б������䳤�ȴ���2���ַ��������������б�
		List<String> string=Arrays.asList("hello","woled","zs","wanwu");
		List<String>cList=string.stream().filter((x)->x.length()>2).collect(Collectors.toList());
		cList.forEach(System.out::println);
		
		//��Ѹ������б������е��ַ���ת��д
		//���б��е��ַ����ã�����
		List<String>G7=Arrays.asList("Usa","japen","France");
		String g7sString=G7.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(g7sString);
		List<Integer> primers=Arrays.asList(2,3,4,6,7,11,13,17,23,29);
//		IntSummaryStatistics intSummaryStatistics=primers.stream().flatMapToInt((x)->x).summaryStatistics();
//		System.out.println("�����"+intSummaryStatistics);
	}
		
	}


