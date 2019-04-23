package com.chansofti.demo.thread;

public class TestBuy {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		StoreHouse storeHouse=new StoreHouse();
		ProductThread productThread=new ProductThread(storeHouse);
		ConsumerThread consumerThread=new ConsumerThread(storeHouse);
		ConsumerThread consumerThread2=new ConsumerThread(storeHouse);
		ConsumerThread consumerThread3=new ConsumerThread(storeHouse);
		ConsumerThread consumerThread4=new ConsumerThread(storeHouse);
		ConsumerThread consumerThread5=new ConsumerThread(storeHouse);
		productThread.start();
		consumerThread.start();
		consumerThread2.start();
		consumerThread3.start();
		consumerThread4.start();
		consumerThread5.start();
	}

}
