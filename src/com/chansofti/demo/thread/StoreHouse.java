package com.chansofti.demo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreHouse {
	// 模拟商品
	private List<String> products = new ArrayList<String>();

	// 生产商品
	public void add(String product) {
		products.add(product);
	}

	Random random = new Random();

	// 消费商品
	public String sale() {
		int len = products.size();
		int index = random.nextInt(len);
		String product = products.remove(index);
		return product;
	}

	// 获得商品
	public int getStoreSize() {
		return products.size();
	}

}
