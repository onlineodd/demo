package com.chansofti.demo.api;

import java.math.BigInteger;

/*
 * ´óÕûÊı
 */
public class BigIntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="12343456643564";
		BigInteger bigInteger=new BigInteger(s1);
		BigInteger rBigInteger=new BigInteger("1");
		System.out.println(bigInteger.add(rBigInteger));//+
		System.out.println(bigInteger.subtract(rBigInteger));//-
		System.out.println(bigInteger.multiply(rBigInteger));//*
		System.out.println(bigInteger.divide(rBigInteger));// /
	}

}
