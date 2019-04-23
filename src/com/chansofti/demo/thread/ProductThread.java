package com.chansofti.demo.thread;

import java.util.Random;

public class ProductThread extends Thread {
	private StoreHouse storeHouse;

	public ProductThread(StoreHouse storeHouse) {
		super();
		this.storeHouse = storeHouse;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random random = new Random();
		while (true) {
			// 生产商品
			synchronized (storeHouse) {
				String productString = "商品" + random.nextInt(1000);
				// 添加到仓库
				storeHouse.add(productString);
				System.out.println("生产者往厂库添加了：" + productString);
				storeHouse.notify();
			}

			try {
				Thread.sleep(500);
				// 休息500ms
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

}
