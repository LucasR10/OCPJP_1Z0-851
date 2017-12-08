package br.com.ocjp6.test1;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder a = new StringBuilder("a");
		
		for (int i = 1; i < 5; i++) 
				a.append("a");
			
	     a.insert(4, "123");
		System.out.println(a);
		
		
	}
	
}
