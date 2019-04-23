package demo;

import java.math.BigDecimal;

public class App2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double a=1.0;
		double b=0.42;
		double c=a-b;
		System.out.println(c);
		BigDecimal x=new BigDecimal("1.0");//保留小数后两位
		BigDecimal y=new BigDecimal("0.42");
		System.out.println("x-y="+x.subtract(y));
		System.out.println("x*y="+x.multiply(y));
//		System.out.println("x/y="+x.divide(y));
		BigDecimal s=new BigDecimal(Double.toString(1.0));
		BigDecimal d=new BigDecimal(Double.toString(0.42));
		s.add(d);
		System.out.println(s);
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1==s2);
		Integer.valueOf(199);
		
	}

}
