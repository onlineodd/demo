package com.chansofti.demo.thread.sync;

public class ChangeThread  extends Thread{
private Person person;
//synchonizedͬ�������
public ChangeThread(Person person) {
	super();
	this.person = person;
}

@Override
public void run() {
	// TODO Auto-generated method stub
	int i=0;
	while(true){
//		synchronized (person) {
			if(i%2==0){
			person.change("����", "��");
		}else {
			person.change("����", "Ů");
		}
//		}
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}
}

}
