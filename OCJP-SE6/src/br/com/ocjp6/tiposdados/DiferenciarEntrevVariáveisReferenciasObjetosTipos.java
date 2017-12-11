package br.com.ocjp6.tiposdados;

public class DiferenciarEntrevVari�veisReferenciasObjetosTipos {
	
	 public static void main(String[] args) {
	
		/**
		 * As vari�veis de tipos primitivos de fato armazenam os valores (e n�o ponteiros/refer�ncias).
		 * Ao se atribuir o valor de uma vari�vel primitiva a uma outra vari�vel, o valor � copiado, e o original n�o � alterado:
		 * */ 
		 int a = 10;
		 int b = a; // copiando o valor de a para b
		 b++; // somando 1 em b
		 System.out.println(a); // continua com 10.
		 System.out.println(b); // continua com 10.
		
		 //---------------------------------------------------------------------------
		 
		 /**
		  * Uma vari�vel de refer�ncia � um ponteiro para o endere�o de mem�ria onde o objeto se encontra. 
		  * Ao atribuirmos uma vari�vel de refer�ncia a outra, estamos copiando a refer�ncia, ou seja, 
		  * fazendo com que as duas vari�veis apontem para o mesmo objeto, e n�o criando um novo objeto:
		  * */
		 Objeto obj1 = new Objeto();
	     Objeto obj2 = obj1; // agora b aponta para o mesmo objeto de a

	     obj1.valor = 5; // alterando o valor do objet referenciado altera o valor do objeto que referencia.

	     System.out.println(obj2.valor); // imprime 5
		 
		 //---------------------------------------------------------------------------
	     /**
	      * Duas refer�ncias s�o consideradas iguais somente se elas est�o apontando para o mesmo objeto.
	      *  Mesmo que os objetos que elas apontem sejam iguais, ainda s�o refer�ncias para objetos diferentes:
	      * */
	     Objeto a1 = new Objeto();
	     a1.valor = 5;

	     Objeto b1 = new Objeto();
	     b1.valor = 5;

	     System.out.println(a1 == b1); // false! porque os objetos s�o diferentes.
	     
	     Objeto c1 = a1;
	     
	     System.out.println(c1 == a1); // true poruqe o objeto c1 referencia para objeto a1 e por tanto tem mesmo valor.

	}

}

class Objeto {
    int valor;
}
