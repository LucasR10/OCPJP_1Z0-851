package br.com.alura;

public class RunnableClasse implements Runnable {

	
	private String nome;
	private Long tempo;
	private Thread td;
	
	public RunnableClasse(String nome, Long tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread td = new Thread(this,this.nome);
		td.start();
		
	}


	@SuppressWarnings("static-access")
	@Override
	public void run() {
		for (int i = 0; i<= 5; i++ ) {
			System.out.println( i+"---------"+Thread.currentThread().getName());
			
			System.out.println( i+" activeCount() "+Thread.activeCount());
			System.out.println( i+" currentThread() "+Thread.activeCount());
			System.out.println( i+" td.getPriority() "+td.getId());
			System.out.println( i+" getState() "+td.getState());
			
			try {
				td.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
    
}
