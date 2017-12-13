package br.com.alura;

public class RunableClasse implements Runnable {

   Thread th ;
	
	public RunableClasse(){
	    th = new Thread(this);
		th.start();
        
	}
	
	
	@Override
	public void run() {

        try {
        	for (int i = 0; i < 5; i++) {
    			System.out.println( " -- " + i);
    			th.sleep(3000);
    		}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		
	}
	

}
