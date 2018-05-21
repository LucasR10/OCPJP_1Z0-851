package br.com.alura;

public class ClasseString {

	static String str1 = "aa";
	static  StringBuilder str2 = new StringBuilder("aa");
	
	public static void main(String[] args) {
		
		System.out.println(str1 +"dsdsds" );
		System.out.println(str2.append("d1") );
         
		System.out.println( str1 );
		System.out.println( str2 );
	}

}
