package com.chansofti.demo.thread;

import java.util.Random;

public class ConsumerThread extends Thread {
	private StoreHouse storeHouse;

	public ConsumerThread(StoreHouse storeHouse) {
		super();
		this.storeHouse = storeHouse;

	}

	// 模拟消费
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (storeHouse) {
				// 判断仓库是否有货
				if (storeHouse.getStoreSize() == 0) {
					System.out.println("仓库空了，消费者进行等待。。。");
					try {
						storeHouse.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					String productString = storeHouse.sale();

					System.out.println("消费者" + Thread.currentThread().getName() + "购买了" + productString);
				}

			}

			try {
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
