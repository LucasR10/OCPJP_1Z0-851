package br.com.ocjp6.livro.interfaces;


/**
 * 1 - As intefaces s� podem declarar constantes e n�o variaveis de inst�ncia.
 * 2 - OS  metodo de uma interface n�o podem ser  static.
 * 3 - Os metodos n�o podem ser marcados com native,  final, strictfp.
 * 4 - Um interface pode extender uma ou mais interfaces difrentes.
 * 5 - Um interface n�o pode implementar outra interface ou classe.
 * 6 
 * 
 * */
public interface Calculo {
	//� opcional declara o public, static.
	// declara�oes validas para constantes.
	int constanteValor  = 10; 
	public static final int val1  	= 10 + 10;
    static final public int val2  	= 10 ;
	final public static int  val3  	= 10;
	
	//declara��es validas de metodos para uma interface.
	
	public int soma(int x, int y);
	
	abstract int mutiplicar(int x, int y);
	
	public abstract int dividir(int x, int y);
	
	abstract public int subitrair(int x, int y);

}
