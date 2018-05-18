package br.com.ocjp6.declaracaoEControleAcesso;


/**
 *  Tres maneiras de acessar um metodo: 
 *  invocar o metodo declarado na mesma clase, 
 *  invocando um metodo usado uma interferência de clase
 *  meio da heranca
 * */
public class DeclarandoUmaInterface extends TestProtected implements declarando{

	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go1() {
		System.out.println( acertos );
		
	}

	@Override
	public void go3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void go0() {
		// TODO Auto-generated method stub
		
	}
	
	// o modificador de acesso protectd só pode ser acessado na sua class ou sb class do memo pacote ou não.
	
	//quando mebros herdam uma propriedadade protected da super classe. O atribuspos com esse modificador 
	//tornase privaodo na subclass. outras classe que acessar essa sub class não vai ter acesso esse atributo criado na super calsse;
	TestProtected t=  new TestProtected();
	
	@Override
	protected void goTo() {
		// TODO Auto-generated method stub
		super.goTo();
	}

}

class TestProtected {
	protected void goTo() {
		
	}
}

interface declarando {
	
	//REGRAD DE DECLARAÇÃO DE COSTANT EM INTERFACES
	/**
	 * Não pode altera um valor de uma costant definidos em  uma interface.
	 * A class que usa a interface pode usar a constante so como leitura.
	 * MESMO NÃO DECLARADO É public static final : não e permitido abstract.
	 * */
	
	 public int x = 9;//É  static final 
	 public static final  int y = 0;
	 double acertos = 0;
	 
	 
	 
/** REGRAS DE DECLARAÇÃO DE UMA INTERFACE.*/
	 /**
	  *  regras de declaração de uma interface:
	  *   - uma interface pode extender uma ou mais interface.
	  *   - uma interface não pode extender nada que não seja uma interface.
	  *   - uma interface não pode implementar outra interface.
	  *   - um interface deve ser delacada com a palavra reserada interface.
	  * */
	 
	public void go();
	public abstract void go1();
	abstract void go3();
	abstract  public void go4();
	void go0();//mesmo que public abstract go0()
	
	
}