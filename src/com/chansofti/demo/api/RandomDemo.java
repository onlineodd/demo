package com.chansofti.demo.api;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		//¹Ì¶¨
		Random random2=new Random(503);
		System.out.println(random2.nextInt());
	}

}
