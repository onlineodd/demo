package com.chansofti.demo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/*
 * jdk8内置了四种核心函数式接口
 * 1、消费型接口
 * Consumer<T>
 * void accept(T t)
 * 
 * 2、共给型接口
 * Supplier<T>
 * T get();
 * 
 * 3、函数型接口
 * Function<T,R>
 * R apply<T,t>
 * 
 * 4、断言型
 * Predicate<T>
 * boolean test <T>
 * 
 * 经常把接口传进去，作为参数使用
 */
public class Lambda4Interface {
	
	public static void main(String[] args) {
			Lambda4Interface iphone = new Lambda4Interface();
			iphone.buy(10000, (m) -> System.out.println("iPhone 降价了,买一个花了" + m + "元"));
			iphone.buy(10000, (m) -> {
				System.out.println("iPhone降价了");
				System.out.println("花了" + (m * 0.9) + "元");
			});
			//随机生成10个整形的随机数
			//List<Integer>list=iphone.getNumList(10, ()->(int)(Math.random()*100));
			List<Integer>list=iphone.getNumList(10, ()->new Random().nextInt(100));
			list.forEach(System.out::println);
			List<Double>list1=iphone.getNumList(3, ()->new Random().nextDouble());
			
			list1.forEach(System.out::println);
			String y=iphone.handlestring("tom", (x)->"Good Moring"+x);
			System.out.println(y);
			String z=iphone.handlestring("tom", (x)->"Good Buy"+x);
			System.out.println(z);
			//折扣方法，传入单价，算出折扣
			double t1=iphone.handlestring1(100.0, (x)->0.2*x);
			System.out.println(t1);
			
			List<Integer> list2= Arrays.asList(100,150,98,76,119);
//			list2.add(100);
//			list2.add(119);
//			list2.add(98);
//			list2.add(50);
			Collections.sort(list2);
			list2.forEach(System.out::println);
		
			List<Integer> listmax=new ArrayList<Integer>();
			listmax.add(33);
			listmax.add(44);
			listmax.add(76);
			listmax.add(29);
			iphone.handlestring2(listmax, (nums)->{
				int max=0;
				for(int i=0;i<nums.size();i++){
					Integer ti=nums.get(i);
					if(max<ti)max=ti;
					return max;
				}
				return Collections.max(listmax);
			});
//			System.out.println(num);
			List<String> listt=Arrays.asList("ass","hello", "woled");
			List<String> filStrings=iphone.filterStrings(listt, (string)->string.length()>3);
			filStrings.forEach(System.out::println);
		}
	
		//消费型
		public void buy(double money, Consumer<Double> consumer) {
			consumer.accept(money);
		}
		//供给型
		public <T> List<T> getNumList(int num,Supplier<T>sup){
		List<T> list=new ArrayList<T>();
		for(int i=0;i<num;i++){
			list.add(sup.get());
		}
		return list;
		}
		//函数型 
		public String handlestring(String string,Function<String,String>function){
			return function.apply(string);
		}
		public <T> T handlestring1(T t,Function<T,T>function1){
			return function1.apply(t);
		}
		public Integer handlestring2(List<Integer> list,Function<List<Integer>,Integer>function){
			return function.apply(list);
		}
		//断言型
		public List<String> filterStrings(List<String> list,Predicate<String> predicate){
			List<String> stringList=new ArrayList<String>();
			for(String str:list){
				if(predicate.test(str)){
					stringList.add(str);
				}
				
			}
			return stringList;
		}

		
	}
