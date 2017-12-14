package br.com.ocjp6.livro.interfaces;

import org.junit.Test;

public class TestaInterfaces {

	@Test
	public void teste(){
		OperacaoMatematica op = new CalculoMatematico();
		System.out.println( op.soma(3, 6) );
	}
}
