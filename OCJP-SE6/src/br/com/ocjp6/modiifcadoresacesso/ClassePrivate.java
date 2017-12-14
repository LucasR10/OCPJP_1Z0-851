package br.com.ocjp6.modiifcadoresacesso;

public   /*ou default */ class ClassePrivate {
	
	// acesso somente dentro da propri classe mesmo usando heranca.
	private String nome; 
	
	/** 
	       �nico modificado de aceso usado dentro de um metodo � : final
	 
	  	   -------------------------------------------------------------------------------------------
	       -              						-   private	-  	default	    -	 protected	-	 public
	       -------------------------------------------------------------------------------------------
		   - Mesma classe						- 	 sim	-     sim		-	    sim		-	   sim
		   --------------------------------------------------------------------------------------------
		   - Mesmo pacote						- 	 n�o	-     sim	    -       sim	    -      sim
		   --------------------------------------------------------------------------------------------
		   - Pacotes diferentes (subclasses)	-	 n�o	-      n�o	    -       sim	    -      sim
		   --------------------------------------------------------------------------------------------
		   - Pacotes diferentes (sem subclasses)-	 n�o	-      n�o	    -       n�o	     -     sim
		   --------------------------------------------------------------------------------------------

	        Modificador final - 
	        A instru��o final indica que a classe, m�todo ou vari�vel assim declarada t�m uma �nica atribui��o que se mant�m constante, 
	        ou seja, n�o pode ser alterada no decorrer do processamento. Al�m de n�o admitir a cria��o de classes filhas.
			Este modificador declara o que chamamos, em programa��o, de constante.
			
			Modificador abstract - 
			A instru��o abstract serve para:
			1 - Declarar m�todos abstratos, ou seja, m�todos que dever�o ser desenvolvidos/implementados nas subclasses. Quando a classe que contiver m�todos abstratos for herdada, 
			os referidos m�todos dever�o ser implementados, caso contr�rio, a classe que extendeu dever� ser declarada como abstrata.
			
			2 - Declarar classes abstratas que se desenvolvem numa(s) subclasse(s). Classes abstratas s�o aquelas que n�o est�o totalmente implementadas/descritas. 
			Uma classe abstrata n�o pode ser instanciada e � amplamente usada nas interfaces.
			
			3 - Um m�todo abstrato tem a seguinte caracter�stica: void getName( ); Caso o m�todo tenha as chaves caracter�sticas {},
			  o mesmo n�o mais ser� considerado abstrato, embora n�o tenha c�digo dentro das chaves.
			  Modificador final[editar | editar c�digo-fonte]
			
**/			
	public  String ola(final String paran) {
		
		final String srt = paran;
		
		return srt;
		
	}
}
