package com.enthuware.ets.scjp.v6.fundamentos;

public class TestClassThread {
	/*
		O primeiro objeto Thread foi criado em: TestClass tc = new TestClass ();
		O segundo objeto Thread é criado em: new Thread (tc.new Runner ()).
		
		Runner não é um objeto Thread.
		Thread [] t = new Thread [5]; não cria nenhum objeto de thread. 
		Apenas cria uma matriz que pode conter 5 objetos de thread. Cada uma dessas 5 referências é inicializada como nula.
		tc.new Runner () é uma construção válida porque Runner é uma classe interna não estática. Então, você não pode fazer 'novo TestClass.Runner ()'.
	*/
	class Runner implements Runnable {
		public void run() {
			
			Thread[] t = new Thread[5];// array de obetos thrad.
			
			for (int i = 0; i < t.length; i++)
				System.out.println(t[i]);
		}
	}
	
	
		

public static void main(String args[]) throws Exception{
	
		        TestClassThread tc = new TestClassThread();// primeiro objeto.
	            new Thread( tc.new Runner() ).start();// segundo objeto.
	   }
		

}
