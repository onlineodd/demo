package com.chansofti.demo.thread.sync;

public class ReadThread extends Thread {
private Person person;
public ReadThread(Person person){
	this.person=person;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	while(true){
//		synchronized (person) {
			System.out.println(person.display());
//		}
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
