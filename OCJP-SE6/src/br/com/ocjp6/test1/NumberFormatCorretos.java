package br.com.ocjp6.test1;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatCorretos {
	
	public static void main(String[] args) {
		NumberFormat i = NumberFormat.getCurrencyInstance();
		NumberFormat i0 = NumberFormat.getInstance();
		NumberFormat i1 = NumberFormat.getInstance(Locale.ITALY);
		//NumberFormat n2 = new NumberFormat();//não compila
		//NumberFormat n3 = new NumberFormat(Locale.CANADA);//não complia
		
	}

}
