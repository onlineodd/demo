package com.chansofti.demo.thread;

//�߳�����

public class BorrowBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String book1="��ĳ÷";
String book2="��ĳ��";
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
			System.out.println("PersonA�赽�ˣ�  "+book1);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			synchronized (book2) {
				System.out.println("PersonA�赽�������飺    "+book1+"   "+book2);
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
				System.out.println("PersonB�赽�ˣ� "+book1);
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				synchronized (book2) {
				System.out.println("PersonB�赽�������飺   "+book1+"  "+book2);	
				}
				}
			}
			
		}