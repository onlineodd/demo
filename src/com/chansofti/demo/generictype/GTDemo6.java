package com.chansofti.demo.generictype;

//�ڽӿ��϶��巺�ͣ���̫����

interface S<T> 
{
	void show(T t);
}
//�����String
class Simpl implements S<String>
{

	@Override
	public void show(String t)
	{
		// TODO Auto-generated method stub
		System.out.println(t);
	}

	
}
//��֪�������������ͣ����Զ���Ϊ����T
class Simpl2<T> implements S<T>
{

	@Override
	public void show(T t)
	{
		// TODO Auto-generated method stub
		System.out.println(t);
	}
}
public class GTDemo6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		S s = new Simpl();
		s.show("asd");
		S<Integer> s2 = new Simpl2<Integer>();
		s2.show(1232213);
		 //s2.show("abc");
	}
}