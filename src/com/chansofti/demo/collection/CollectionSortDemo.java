package com.chansofti.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CollectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("张飞", 27));
		list.add(new Person("关羽", 28));
		list.add(new Person("刘备", 30));
		list.add(new Person("赵云", 25));
		//像根据age排序
		Collections.sort(list);
		for(Person person:list)
		{
			System.out.println(person);
		}
	}

}
class Person implements Comparable<Person> {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
