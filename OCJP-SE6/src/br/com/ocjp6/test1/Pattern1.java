package br.com.ocjp6.test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("My");
		
		Matcher m = p.matcher("My dad And My mom");
		
		StringBuffer s = new StringBuffer();
		
		boolean found = m.find();
		
		while (found) {
			
			m.appendReplacement(s, "Our");// replacement onde incontra a pattent My
			found = m.find();
		}
		
		m.appendTail(s);
		System.out.println(s);
	}
}
