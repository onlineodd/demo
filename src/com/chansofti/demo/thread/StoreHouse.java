package com.chansofti.demo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreHouse {
	// ģ����Ʒ
	private List<String> products = new ArrayList<String>();

	// ������Ʒ
	public void add(String product) {
		products.add(product);
	}

	Random random = new Random();

	// ������Ʒ
	public String sale() {
		int len = products.size();
		int index = random.nextInt(len);
		String product = products.remove(index);
		return product;
	}

	// �����Ʒ
	public int getStoreSize() {
		return products.size();
	}

}
