package com.chansofti.demo.thread;

public class Sde extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sde sde=new Sde();
		sde.start();
		
	}
	public void run(){
		int x=0;
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
