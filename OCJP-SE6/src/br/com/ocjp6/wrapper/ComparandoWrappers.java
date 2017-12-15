package br.com.ocjp6.wrapper;

public class ComparandoWrappers {

	public static void main(String[] args) {
		/*
		 * 
		 * == testa se dois objetos s�o id�nticos. Ou seja, se ocupam o mesmo local na mem�ria. Equals testa conte�do.
		 * 
		 * Voc� pode ter 2 strings, por exemplo, com o mesmo conte�do, mas sendo objetos
		 * diferentes:
		 * 
		 *  String a = new String("Teste"); 
		 *  String b = new String("Teste");
		 *  
		 * a == b; //False a.equals(b); //True
		 * 
		 * O mesmo vale pro seu calendar.
		 * 
		 * O == s� testa conte�do no caso dos tipos primitivos.
		 * 
		 */
		
		Integer a1 = 10;
		Integer a2 = 10;
		
		boolean valInteger = (a1 == a2);// compara valores;
		System.out.println( valInteger );
		
		Integer ab1 = new Integer( 10 );
		Integer ab2 = new Integer( 10 );
		
		boolean valIntegerNew = (ab1 == ab2); //comparando referncia de objetos;
		System.out.println( valIntegerNew );// false
		System.out.println( ab1.equals(ab2) );//true
		

	}

}
