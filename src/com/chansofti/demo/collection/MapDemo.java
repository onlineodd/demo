package com.chansofti.demo.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Mapʾ��
 * key=value
 * key�����ظ�
 */
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>();
		map.put("��","����");
		map.put("��", "����");
		
		String string = map.get("��");
		System.out.println(string);
		//����
		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(System.out::println);
		//System.out.println(entrySet);
		//ͨ��key����
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			System.out.println(key);
			String value=map.get(key);
			System.out.println(key+"="+value);
		}
	}

}
