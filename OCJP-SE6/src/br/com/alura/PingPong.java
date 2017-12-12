package br.com.alura;

public class PingPong extends Thread {
	

	private String nome;
	private long tempo;

	public PingPong(String n, long t) {
		this.nome = n ; this.tempo= t;
		start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
		     System.out.println("Olá "+ i +" "+ nome);	
		     try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	}
	public static void main(String[] args) {
		
		new PingPong("Teste", 2000);
		 
	}

}
