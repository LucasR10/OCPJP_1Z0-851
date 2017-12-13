package br.com.ocjp6.concurrency;

import org.junit.Ignore;
import org.junit.Test;

public class TDDRunnable {
	
	
	/*
	 * shttps://learning.whizlabs.com/mod/quiz/review.php?attempt=770683&page=3
	 * */
	
	
	
	@Test
	@Ignore
	public void question_1(){
		
		 new Thread( new MyRunnable() ).start();
		// thread.start();
		
	} 
	
	@Test
	@Ignore
	public void question_2(){
		
		Runnable run = new Runnable() { 
			public void run() {
				System.out.println("Dog1");
            }
		};
		

		Thread t = new Thread(run) {
			public void run() {
				System.out.println("Dog");
            }
		}; 
			t.start();
			
		};
		
		
		@Test
		public void question_3(){
			//** synchronized é usado como palavra chave antes: metodos de clas, bloco de codigo emqualquer metodo, instancia de metodos.
			
			MyThread a = new MyThread("A");
			MyThread b = new MyThread("B");
			
			b.start();
			Thread.yield();
			a.run();
			
			
			
		}
		
		
	

}
