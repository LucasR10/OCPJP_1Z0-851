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
		public void question_3() throws InterruptedException{
			
			
			MyThread a = new MyThread("A");
			MyThread b = new MyThread("B");
			
			b.start();
			Thread.sleep(3000L);
			a.run();
			
			
			
		}
		
		public void question_4_text() {
			//** synchronized é usado como palavra chave antes: metodos de clas, bloco de codigo emqualquer metodo, instancia de metodos.
		}
		
		@Test
		public void question_5(){
		
			
		  Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				String str = "hello";
				synchronized (str) {
					System.out.println(Thread.currentThread().getName() );
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() );
				}
				
			}
		};
			
			 new Thread(runnable,"A").start();
			 new Thread(runnable,"B").start();
		
		}
		
		
	

}
