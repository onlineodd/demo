package com.chansofti.demo.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Condition;

/*
 * setʾ��
 * set���ظ�
 */
public class SetDeemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		Set<String> set=new HashSet<String>();
		//���
		set.add("zs");
		set.add("ls");
		set.add("zs");
		//��С
		System.out.println(set.size());
		//ɾ��
		set.remove("zs");
		//����
		for(String string:set){
			System.out.println(string);
		}
	}

}
