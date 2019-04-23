package com.chansofti.demo.thread.sync;

public class ChangeThread  extends Thread{
private Person person;
//synchonized同步代码块
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
			person.change("温涛", "男");
		}else {
			person.change("西西", "女");
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
