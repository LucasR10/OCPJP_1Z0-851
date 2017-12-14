package br.com.ocjp6.modiifcadoresacesso;

public   /*ou default */ class ClassePrivate {
	
	// acesso somente dentro da propri classe mesmo usando heranca.
	private String nome; 
	
	/** 
	       Único modificado de aceso usado dentro de um metodo é : final
	 
	  	   -------------------------------------------------------------------------------------------
	       -              						-   private	-  	default	    -	 protected	-	 public
	       -------------------------------------------------------------------------------------------
		   - Mesma classe						- 	 sim	-     sim		-	    sim		-	   sim
		   --------------------------------------------------------------------------------------------
		   - Mesmo pacote						- 	 não	-     sim	    -       sim	    -      sim
		   --------------------------------------------------------------------------------------------
		   - Pacotes diferentes (subclasses)	-	 não	-      não	    -       sim	    -      sim
		   --------------------------------------------------------------------------------------------
		   - Pacotes diferentes (sem subclasses)-	 não	-      não	    -       não	     -     sim
		   --------------------------------------------------------------------------------------------

	        Modificador final - 
	        A instrução final indica que a classe, método ou variável assim declarada têm uma única atribuição que se mantém constante, 
	        ou seja, não pode ser alterada no decorrer do processamento. Além de não admitir a criação de classes filhas.
			Este modificador declara o que chamamos, em programação, de constante.
			
			Modificador abstract - 
			A instrução abstract serve para:
			1 - Declarar métodos abstratos, ou seja, métodos que deverão ser desenvolvidos/implementados nas subclasses. Quando a classe que contiver métodos abstratos for herdada, 
			os referidos métodos deverão ser implementados, caso contrário, a classe que extendeu deverá ser declarada como abstrata.
			
			2 - Declarar classes abstratas que se desenvolvem numa(s) subclasse(s). Classes abstratas são aquelas que não estão totalmente implementadas/descritas. 
			Uma classe abstrata não pode ser instanciada e é amplamente usada nas interfaces.
			
			3 - Um método abstrato tem a seguinte característica: void getName( ); Caso o método tenha as chaves características {},
			  o mesmo não mais será considerado abstrato, embora não tenha código dentro das chaves.
			  Modificador final[editar | editar código-fonte]
			
**/			
	public  String ola(final String paran) {
		
		final String srt = paran;
		
		return srt;
		
	}
}
