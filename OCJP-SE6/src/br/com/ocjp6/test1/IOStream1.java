package br.com.ocjp6.test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOStream1 {
	public void main(String[] args) {
		try
		{
		//#1

			
		BufferedWriter out = new BufferedWriter(new FileWriter("abc.txt", true));// param 1 - nome arquivo, param 2 se tru escreva no arqui ou false não escreva.
		out.close();
		} 
		catch (IOException e){
			e.printStackTrace();
		}
		}
		
		
}
