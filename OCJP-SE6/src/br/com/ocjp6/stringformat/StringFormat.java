package br.com.ocjp6.stringformat;

import org.junit.Test;

public class StringFormat {
	
	
	@Test
	public void StringFormatting() {
		
		String str = String.format("%s = %d","joe", 35);
		
		System.out.println(" Saida : "+ str);
		
		System.out.printf("My name is: %s%n", "joe");
		
	}

}
