package com.chansofti.demo.generictype;

public class GTDemo5 
{
	//���Ͷ����ڷ�����
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GTDemo5 gtDemo5=new GTDemo5();
		gtDemo5.show("asd");
		gtDemo5.show(1);
		gtDemo5.show(0.5);
	}
	//�ڷ���ֵ�ͷ��ʿ��Ʒ��м䣬���뷺��
		public<T> void show(T t)
		{
		System.out.println(t);
	
		}

}
