package br.com.ocjp6.livro.interfaces;

public class CalculoMatematico implements OperacaoMatematica{

	@Override
	public int soma(int x, int y) {
		return x + y;
	} 

}
