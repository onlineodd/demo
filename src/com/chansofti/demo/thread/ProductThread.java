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
			// ������Ʒ
			synchronized (storeHouse) {
				String productString = "��Ʒ" + random.nextInt(1000);
				// ��ӵ��ֿ�
				storeHouse.add(productString);
				System.out.println("����������������ˣ�" + productString);
				storeHouse.notify();
			}

			try {
				Thread.sleep(500);
				// ��Ϣ500ms
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

}
