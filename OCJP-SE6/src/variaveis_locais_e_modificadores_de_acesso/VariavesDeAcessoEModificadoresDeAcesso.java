package variaveis_locais_e_modificadores_de_acesso;

public class VariavesDeAcessoEModificadoresDeAcesso {

	/**
	 * N�o exite nenhum modificador de acesso que posa ser aplicado ao variaves local. No entanto o modificado final 
	 * pode ser aplicado a variaves locais. 
	 *  
	 * 
	 * */
	
	/**
	 * 
	 * */
	
	public void UsandoFinalEmVariavesLocais() {
		final String variavel_com_modificador_de_acesso_final;//

	}
	
	
	public static void main(String[] args) {
		int k = 5/0;
		System.out.println(k);
	}
}

/***
 * � invalido ter um �nico m�todo abstract que seja uma calsse que n�o seja explicitamente como abistra.
 * Ou seja ter uma classe que tenha um unico metodo ele seja abstrato n�o pode.
 * 
 * uma clase abistrata que herda de outra clase abistrata n�o � obrigatorio implemtas os metodos abistratos da
 * outra classe abistrata mais se ele queise pode implementar n�o empde.
 * 
 * - uma metodo n�o pode nunca jamais ser marcado como abstract e final a mesmo tempo ou abistract e privateao mesmo tempo.
 * - 
 * meotoso invalido : abstract static goto(); // n�o compila
 * */

// class  IlegalClassw{ n�o complia essa classe
//	abstract void go();
//}