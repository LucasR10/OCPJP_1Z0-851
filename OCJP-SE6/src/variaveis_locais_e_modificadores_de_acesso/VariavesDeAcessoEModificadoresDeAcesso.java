package variaveis_locais_e_modificadores_de_acesso;

public class VariavesDeAcessoEModificadoresDeAcesso {

	/**
	 * Não exite nenhum modificador de acesso que posa ser aplicado ao variaves local. No entanto o modificado final 
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
 * é invalido ter um único método abstract que seja uma calsse que não seja explicitamente como abistra.
 * Ou seja ter uma classe que tenha um unico metodo ele seja abstrato não pode.
 * 
 * uma clase abistrata que herda de outra clase abistrata não é obrigatorio implemtas os metodos abistratos da
 * outra classe abistrata mais se ele queise pode implementar não empde.
 * 
 * - uma metodo não pode nunca jamais ser marcado como abstract e final a mesmo tempo ou abistract e privateao mesmo tempo.
 * - 
 * meotoso invalido : abstract static goto(); // não compila
 * */

// class  IlegalClassw{ não complia essa classe
//	abstract void go();
//}