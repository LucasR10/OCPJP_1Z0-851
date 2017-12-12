package br.com.alura;

import java.time.temporal.Temporal;

public class Semaforo extends Thread {
	
	private boolean continua = false;
	private Long tempo;

	public void abeto() throws InterruptedException {
		System.out.println( " Verde" + continua );
		continua = true;
		sleep(tempo);
		System.out.println( " Verde" + continua );
		
	}


	public void esperando() {
		System.out.println( " Laranja");
		continua = true;
	}

	public void fechado() {
		System.out.println( " Vermelho ");
		continua = true;
	}
	
	
	public Semaforo(Long tempo) {
      this.tempo = tempo;
		start();
		
	}
	
	@Override
	public void run() {
		try {
			continua = true;
			while( continua ) {
				fechado();
				abeto();
				esperando();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( activeCount());
	}

}
