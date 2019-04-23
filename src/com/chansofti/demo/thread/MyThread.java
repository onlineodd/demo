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
		//main 称为主线程，主线程是JVM启动的，一般来说主线程都是最后关闭的，因为他还要负责线程
		//子线程就是创建的zs和li线程
		while(true){
			System.out.println(Thread.currentThread().getName()+"哈哈哈");
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
		System.out.println(Thread.currentThread().getName()+"咻咻咻");
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
