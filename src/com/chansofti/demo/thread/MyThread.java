package com.chansofti.demo.thread;

public class MyThread extends Thread 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		myThread.setName("zs");
		myThread.start();
		MyThread myThread2=new MyThread();
	myThread2.setName("ls");
		myThread2.start();
		//main ��Ϊ���̣߳����߳���JVM�����ģ�һ����˵���̶߳������رյģ���Ϊ����Ҫ�����߳�
		//���߳̾��Ǵ�����zs��li�߳�
		while(true){
			System.out.println(Thread.currentThread().getName()+"������");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	@Override
public  void run()
	{
	while(true)
	{
		System.out.println(Thread.currentThread().getName()+"������");
		try 
		{
			Thread.sleep(500);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
