package com.chansofti.demo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * list ʾ��
 * list���ظ�������
 */
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		List<String> list =new ArrayList<String>();
		//���Ԫ��
		list.add("sad");
		list.add("qwe");
		//��С
		System.out.println(list.size());
		
		//ɾ��
		list.remove("qwe");
		
		for (String string:list) {
			System.out.println(list);
		}
		//��ͨѭ������
		for (int i = 0; i < list.size(); i++) {
			String string=list.get(i);
			System.out.println(string);
		}
		//��������
		Iterator<String>iterator =list.iterator();
		while (iterator.hasNext()){
			String string=iterator.next();
			System.out.println(string);
		}
		//����
		System.out.println(list.contains("qwe"));
	}

}
