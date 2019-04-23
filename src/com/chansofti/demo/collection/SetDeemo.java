package com.chansofti.demo.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Condition;

/*
 * set示例
 * set不重复
 */
public class SetDeemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义
		Set<String> set=new HashSet<String>();
		//添加
		set.add("zs");
		set.add("ls");
		set.add("zs");
		//大小
		System.out.println(set.size());
		//删除
		set.remove("zs");
		//遍历
		for(String string:set){
			System.out.println(string);
		}
	}

}
