package br.com.ocjp6.concurrency;

public class MyThread extends Thread {
	
	public void run() {
	  m1();
	}
	
	public  MyThread(String threadName) {
	   super(threadName);
	}
	
	public synchronized void m1() {
		System.out.println( Thread.currentThread().getName()  );
	}

}
