package com.chansofti.demo.exception;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int x=100;
		int y=0;
		System.out.println("x/y="+x/y);
		System.out.println(x*y);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("��������Ϊ0");
			//return;
			System.exit(0);//ǿ���˳�
			
		}finally{
		System.out.println("һ���ᱻִ��");
	}
		System.out.println("main����������");
		
	}

}
