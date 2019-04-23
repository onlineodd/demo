package com.chansofti.demo.thread.sync;
//synchronized同步方法
public abstract class Person {
	protected String name;
	protected String sex;
	abstract void change(String name,String sex) ;
	abstract String display() ;

}
