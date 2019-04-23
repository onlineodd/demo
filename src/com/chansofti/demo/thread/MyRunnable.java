package com.chansofti.demo.thread;

public  class MyRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myRunnable=new MyRunnable();
		Thread t1=new Thread(myRunnable);
		t1.start();
		Thread t2=new Thread(myRunnable);
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(Thread.currentThread().getName()+"บวบวบว");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
