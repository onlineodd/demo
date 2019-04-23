package com.chansofti.demo.zy;

public class Tea {
public static void main(String[] args) {
	String cup="洗杯子";
	String bw="烧水";
	Cup cut=new Cup(cup);
	cut.start();
	BoilingWater boilingWater=new BoilingWater(bw);
	boilingWater.start();
}
}
class Cup extends Thread{
	String cup;

	public Cup(String cup) {
	super();
	this.cup = cup;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (cup) {
			System.out.println("开始洗杯子");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("杯子洗好等烧好水开始泡茶！");
		}
		
		}
	
	
	}
class BoilingWater extends Thread{
	String bw;
	
	public BoilingWater(String bw) {
		super();
		this.bw = bw;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		synchronized (bw) {
			System.out.println("开始烧水");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		}
		System.out.println("烧水完成,开始泡茶");
	}
	
}