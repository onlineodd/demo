package com.chansofti.demo.pe;

public  class Tank implements TanKInterface{


	public static void main(String[] args) {
		Tank tank=new Tank();
		tank.move();
		tank.attack();
		tank.foo();
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("̹���ڹ���");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("̹�����ƶ�");
		
	}

}
