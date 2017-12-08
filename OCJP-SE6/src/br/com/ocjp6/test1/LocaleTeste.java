package br.com.ocjp6.test1;

import java.util.Locale;

public class LocaleTeste {

	
	public static void main(String[] args) {
	  
		//new Locale();//LocaleConstrutor.java:10: error: no suitable constructor found for Locale(no arguments)
		new Locale("language");//ok
		new Locale("language", "country");//ok
		new Locale("language", "country"," variant");//ok
		
	}
	

}
