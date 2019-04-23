package com.chansofti.demo.generictype;

public class GTDemo4 <T>
{//·ºÐÍ
	private T t;
	public T getT()
	{
		return t;
	}

	public void setT(T t) 
	{
		this.t = t;
	}
	
	public GTDemo4(T t) 	
	{
		super();
		this.t = t;
	}
	public void show ()
{
	System.out.println(t);
}
//	private Object object;
//	
//	public GTDemo4(Object object) 
//	{
//		super();
//		this.object = object;
//	}
//
//	public Object getObject() 
//	{
//		return object;
//	}
//
//	public void setObject(Object object)
//	{
//		this.object = object;
//	}
//	public void show()
//	{
//		System.out.println(object);
//	}

	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		GTDemo4 gtDemo4=new GTDemo4("asd");
//		gtDemo4.show();
		GTDemo4<String> gtDemo4=new GTDemo4<String>("asd");
		gtDemo4.show();
		GTDemo4<Integer> gtDemo42=new GTDemo4<Integer>(15);
		gtDemo42.show();
		GTDemo4<Float> gtDemo43=new GTDemo4<Float>(3.22f);
		gtDemo43.show();
		GTDemo4<Double> gtDemo44=new GTDemo4<Double>(3.1415926);
		gtDemo44.show();
	}

}
