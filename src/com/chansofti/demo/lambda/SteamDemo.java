package com.chansofti.demo.lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdk8添加的一个新的抽象，成为Stream，可以让你以一种流式的方式来针对数据进行处理
		//stream化成流式
		//map针对流中的每一个元素
		List<Integer> nums=Arrays.asList(100,200,300,400,500);
		nums.stream().map((num)->num*1.12).forEach(System.out::println);
		for(Integer integer:nums){
			double r=integer*1.12;
			System.out.println(r);
		}
		
		//获取对应数据的平方数，去重，并重新收集成列表
		//distinct去重
		//collect收集成列表
		List<Integer> nums2=Arrays.asList(3,2,2,3,7,3,5);
		List<Integer> collect=nums2.stream().map((x)->x*x).distinct().collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		//filter用于过滤
		//针对给出的字符串列表，过滤其长度大于2的字符串，重新生成列表
		List<String> string=Arrays.asList("hello","woled","zs","wanwu");
		List<String>cList=string.stream().filter((x)->x.length()>2).collect(Collectors.toList());
		cList.forEach(System.out::println);
		
		//想把给定的列表中所有的字符串转大写
		//把列表中的字符串用，连接
		List<String>G7=Arrays.asList("Usa","japen","France");
		String g7sString=G7.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(g7sString);
		List<Integer> primers=Arrays.asList(2,3,4,6,7,11,13,17,23,29);
//		IntSummaryStatistics intSummaryStatistics=primers.stream().flatMapToInt((x)->x).summaryStatistics();
//		System.out.println("最大数"+intSummaryStatistics);
	}
		
	}


