package com.chansofti.demo.thread;

import java.util.Random;

public class ConsumerThread extends Thread {
	private StoreHouse storeHouse;

	public ConsumerThread(StoreHouse storeHouse) {
		super();
		this.storeHouse = storeHouse;

	}

	// ģ������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (storeHouse) {
				// �жϲֿ��Ƿ��л�
				if (storeHouse.getStoreSize() == 0) {
					System.out.println("�ֿ���ˣ������߽��еȴ�������");
					try {
						storeHouse.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					String productString = storeHouse.sale();

					System.out.println("������" + Thread.currentThread().getName() + "������" + productString);
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
