package br.com.xti.theads;

import org.junit.Test;

public class PingPong extends Thread {

	 private String palavra;
	 private long tempo;
	 
	public PingPong() {
		
	}
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
		
	}

	public PingPong(String palavra , long tempo) {
		 this.palavra = palavra;
		 this.tempo = tempo;
		System.out.println(  palavra );
	}
	 
	public static void main(String[] args) {
		new PingPong("Ping ", 3000).start();
		new PingPong("Pong ", 3500).start();
	}
		
}
	