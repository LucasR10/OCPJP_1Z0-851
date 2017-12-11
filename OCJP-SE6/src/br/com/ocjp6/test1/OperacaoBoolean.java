package br.com.ocjp6.test1;

public class OperacaoBoolean {
	
	public static void main(String[] args) {
		
		Boolean a1 = new Boolean("True");//true
		Boolean b2 = new Boolean("Null");//false
		Boolean c3 = new Boolean("-1");//false
		
		System.out.println(a1);
		System.out.println(b2);
		System.out.println(c3);
		
		Boolean  d  = true;
		
		System.out.println( (a1 || c3 ) && d);
	}

}
