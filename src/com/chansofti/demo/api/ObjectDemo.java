package com.chansofti.demo.api;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coures c1=new Coures("java", 88);
		Coures c2=new Coures("java", 88);
		Coures c3=c2;
		System.out.println("c1:"+c1.hashCode());
		System.out.println("c2:"+c2.hashCode());
		System.out.println("c3:"+c3.hashCode());
		System.out.println("c1=c2"+(c1==c2));
		System.out.println("c2=c3"+(c2==c3));
		System.out.println("c1=c3"+(c1==c3));
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		System.out.println(c1);
	}

}
class Coures{
	public String name;
	public Integer score;
	public Coures(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//	}
//	
	
}