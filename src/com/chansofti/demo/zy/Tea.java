package com.chansofti.demo.zy;

public class Tea {
public static void main(String[] args) {
	String cup="ϴ����";
	String bw="��ˮ";
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
			System.out.println("��ʼϴ����");
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("����ϴ�õ��պ�ˮ��ʼ�ݲ裡");
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
			System.out.println("��ʼ��ˮ");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		}
		System.out.println("��ˮ���,��ʼ�ݲ�");
	}
	
}