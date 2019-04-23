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
		System.out.println("线程A开始运行");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程A结束");
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
		
		System.out.println("线程B开始运行");
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
		System.out.println("线程B结束");
	}
	
}
