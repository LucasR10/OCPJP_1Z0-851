package br.com.ocjp6.declaracaoEControleAcesso;


/**
 *  Tres maneiras de acessar um metodo: 
 *  invocar o metodo declarado na mesma clase, 
 *  invocando um metodo usado uma interfer�ncia de clase
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
	
	// o modificador de acesso protectd s� pode ser acessado na sua class ou sb class do memo pacote ou n�o.
	
	//quando mebros herdam uma propriedadade protected da super classe. O atribuspos com esse modificador 
	//tornase privaodo na subclass. outras classe que acessar essa sub class n�o vai ter acesso esse atributo criado na super calsse;
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
	
	//REGRAD DE DECLARA��O DE COSTANT EM INTERFACES
	/**
	 * N�o pode altera um valor de uma costant definidos em  uma interface.
	 * A class que usa a interface pode usar a constante so como leitura.
	 * MESMO N�O DECLARADO � public static final : n�o e permitido abstract.
	 * */
	
	 public int x = 9;//�  static final 
	 public static final  int y = 0;
	 double acertos = 0;
	 
	 
	 
/** REGRAS DE DECLARA��O DE UMA INTERFACE.*/
	 /**
	  *  regras de declara��o de uma interface:
	  *   - uma interface pode extender uma ou mais interface.
	  *   - uma interface n�o pode extender nada que n�o seja uma interface.
	  *   - uma interface n�o pode implementar outra interface.
	  *   - um interface deve ser delacada com a palavra reserada interface.
	  * */
	 
	public void go();
	public abstract void go1();
	abstract void go3();
	abstract  public void go4();
	void go0();//mesmo que public abstract go0()
	
	
}