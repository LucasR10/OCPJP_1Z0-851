package br.com.ocjp6.concurrency;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println(" running");
	}
	
	public void start() {// n�o faz difren�as.
         run();
	}

}
