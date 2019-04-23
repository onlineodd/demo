package com.chansofti.demo.generictype;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GTDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("zs"));
		list.add(new Person("ls"));
		list.add(new Person("ww"));
		printPerson2(list);
		List<QQ> list2=new ArrayList<QQ>();
		list2.add(new QQ("jia"));
		list2.add(new QQ("yi"));
		list2.add(new QQ("big"));
		printPerson2(list2);
	}

	
	//泛型限定
	
	public static void printPerson2(List<? extends Person> list){
		Iterator<?> it=list.iterator();
		//iterator :迭代器
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
	//泛型
//	public static<T> void printPerson(List<T> list){
//		Iterator<T> it=list.iterator();
//		//iterator :迭代器
//		while (it.hasNext()){
//			System.out.println(it.next());
//		}
//	}
}
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	}
class QQ extends Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public QQ(String name) {
		super(name);
		this.name = name;
	}
	
}

	

