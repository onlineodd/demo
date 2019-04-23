package com.chansofti.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * list 示例
 * list可重复，无序
 */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义
		List<String> list =new ArrayList<String>();
		//添加元素
		list.add("sad");
		list.add("qwe");
		//大小
		System.out.println(list.size());
		
		//删除
		list.remove("qwe");
		
		for (String string:list) {
			System.out.println(list);
		}
		//普通循环遍历
		for (int i = 0; i < list.size(); i++) {
			String string=list.get(i);
			System.out.println(string);
		}
		//迭代遍历
		Iterator<String>iterator =list.iterator();
		while (iterator.hasNext()){
			String string=iterator.next();
			System.out.println(string);
		}
		//查找
		System.out.println(list.contains("qwe"));
	}

}
