package demo;

import org.omg.CORBA.PUBLIC_MEMBER;

public class OuterClass1
{
	private String name;
	private Integer age;
	
	public void display ()
	{//�ֲ��ڲ���
		class InnerClass 
		{
			public InnerClass()
			{//���Բ����ⲿ���Ա����
				name="Tom";
				age=23;
				
			}
			public void display()
			{
			System.out.println("name��"+name+"   age��"+age);	
			}
		}
		//�ڷ����������ڲ���
		InnerClass innerClass=new InnerClass();
		innerClass.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 outerClass1=new OuterClass1();
		outerClass1.display();
	}

}
