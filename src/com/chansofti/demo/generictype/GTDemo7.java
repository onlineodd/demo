package com.chansofti.demo.generictype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GTDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		printList1(list);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		printList(list2);
		printList2(list2);
		printList2(list);
	}
		
	public static void printList1(List<String> list){
	Iterator<String> it1=list.iterator();
	while (it1.hasNext()){
		System.out.println(it1.next());
	}
	}
	//泛型定义在方法上
	public static<T> void printList(List<T> list){
		Iterator<T> it=list.iterator();
		//iterator :迭代器
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void printList2(List<?> list){
		Iterator<?> it=list.iterator();
		//iterator :迭代器
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
