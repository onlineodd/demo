package com.chansofti.demo.thread;

import javax.activation.MailcapCommandMap;

public class ThreadJoinDemo extends Thread {
public static void main(String[] args) {
	ThreadJoinDemo threadJoinDemo=new ThreadJoinDemo();
	threadJoinDemo.start();
	ThreadB threadB=new ThreadB(threadJoinDemo);
	threadB.start();
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�߳�A��ʼ����");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�߳�A����");
	}

}
class ThreadB extends Thread{
	private Thread thread;

	public ThreadB(Thread thread) {
		super();
		this.thread = thread;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("�߳�B��ʼ����");
		try {
			thread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�߳�B����");
	}
	
}
