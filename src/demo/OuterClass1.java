package demo;

import org.omg.CORBA.PUBLIC_MEMBER;

public class OuterClass1
{
	private String name;
	private Integer age;
	
	public void display ()
	{//局部内部类
		class InnerClass 
		{
			public InnerClass()
			{//可以操作外部类成员变量
				name="Tom";
				age=23;
				
			}
			public void display()
			{
			System.out.println("name："+name+"   age："+age);	
			}
		}
		//在方法区调用内部类
		InnerClass innerClass=new InnerClass();
		innerClass.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 outerClass1=new OuterClass1();
		outerClass1.display();
	}

}
