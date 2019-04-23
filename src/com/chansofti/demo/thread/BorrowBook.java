package com.chansofti.demo.thread;

//线程死锁

public class BorrowBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String book1="金某梅";
String book2="西某记";
PersonA schA=new PersonA(book1, book2);
schA.start();
PersonB schB=new PersonB(book1, book2);
schB.start();
	}


}

class PersonA extends Thread{
	String book1;
	String book2;
	public PersonA(String book1, String book2) {
		super();
		this.book1 = book1;
		this.book2 = book2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (book1) {
			System.out.println("PersonA借到了：  "+book1);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (book2) {
				System.out.println("PersonA借到了两本书：    "+book1+"   "+book2);
			}
		}
		
	}
	
}
class PersonB extends Thread{
			String book1;
			String  book2;
			public PersonB(String book1, String book2) {
				super();
				this.book1 = book1;
				this.book2 = book2;
			}
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (book1) {
				System.out.println("PersonB借到了： "+book1);
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				synchronized (book2) {
				System.out.println("PersonB借到了两本书：   "+book1+"  "+book2);	
				}
				}
			}
			
		}