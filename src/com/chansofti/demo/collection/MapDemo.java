package com.chansofti.demo.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map示例
 * key=value
 * key不能重复
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("春","张三");
		map.put("夏", "李四");
		
		String string = map.get("春");
		System.out.println(string);
		//遍历
		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(System.out::println);
		//System.out.println(entrySet);
		//通过key遍历
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			System.out.println(key);
			String value=map.get(key);
			System.out.println(key+"="+value);
		}
	}

}
