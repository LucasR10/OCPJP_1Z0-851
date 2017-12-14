package br.com.ocjp6.livro.interfaces;


/**
 * 1 - As intefaces só podem declarar constantes e não variaveis de instância.
 * 2 - OS  metodo de uma interface não podem ser  static.
 * 3 - Os metodos não podem ser marcados com native,  final, strictfp.
 * 4 - Um interface pode extender uma ou mais interfaces difrentes.
 * 5 - Um interface não pode implementar outra interface ou classe.
 * 6 
 * 
 * */
public interface Calculo {
	//é opcional declara o public, static.
	// declaraçoes validas para constantes.
	int constanteValor  = 10; 
	public static final int val1  	= 10 + 10;
    static final public int val2  	= 10 ;
	final public static int  val3  	= 10;
	
	//declarações validas de metodos para uma interface.
	
	public int soma(int x, int y);
	
	abstract int mutiplicar(int x, int y);
	
	public abstract int dividir(int x, int y);
	
	abstract public int subitrair(int x, int y);

}
