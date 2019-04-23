package com.chansofti.demo.thread.sync;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new OriPerson("ÎÂÌÎ", "ÄĞ");
		ChangeThread changeThread=new ChangeThread(person);
		ReadThread readThread=new ReadThread(person);
		changeThread.start();
		readThread.start();
	}

}
