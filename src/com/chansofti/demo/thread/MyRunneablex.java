package com.chansofti.demo.thread;

public class MyRunneablex implements Runnable{
	private int x=0;//¹²ÓÃµÄ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunneablex myRunneablex=new MyRunneablex();
		Thread t1=new Thread(myRunneablex);
		t1.start();
		Thread t2=new Thread(myRunneablex);
		t2.start();

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			x++;
			System.out.println(Thread.currentThread().getName()+" x="+x);
			
			if(x==100)
				break;
			
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	

}
