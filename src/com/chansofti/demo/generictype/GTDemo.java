package com.chansofti.demo.generictype;

import java.util.ArrayList;
import java.util.List;

public class GTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList(); //·ºÐÍ
		list.add(1);
		list.add(2);
		list.add(3);
		//list.add("abc");
		for(int i=0;i<list.size();i++)
		{
			Integer numInteger=(Integer)list.get(i);
			System.out.println(numInteger+3);
		}
	}

}
