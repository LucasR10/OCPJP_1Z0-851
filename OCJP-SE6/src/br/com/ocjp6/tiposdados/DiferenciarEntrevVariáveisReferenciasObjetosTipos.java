package br.com.ocjp6.tiposdados;

public class DiferenciarEntrevVariáveisReferenciasObjetosTipos {
	
	 public static void main(String[] args) {
	
		/**
		 * As variáveis de tipos primitivos de fato armazenam os valores (e não ponteiros/referências).
		 * Ao se atribuir o valor de uma variável primitiva a uma outra variável, o valor é copiado, e o original não é alterado:
		 * */ 
		 int a = 10;
		 int b = a; // copiando o valor de a para b
		 b++; // somando 1 em b
		 System.out.println(a); // continua com 10.
		 System.out.println(b); // continua com 10.
		
		 //---------------------------------------------------------------------------
		 
		 /**
		  * Uma variável de referência é um ponteiro para o endereço de memória onde o objeto se encontra. 
		  * Ao atribuirmos uma variável de referência a outra, estamos copiando a referência, ou seja, 
		  * fazendo com que as duas variáveis apontem para o mesmo objeto, e não criando um novo objeto:
		  * */
		 Objeto obj1 = new Objeto();
	     Objeto obj2 = obj1; // agora b aponta para o mesmo objeto de a

	     obj1.valor = 5; // alterando o valor do objet referenciado altera o valor do objeto que referencia.

	     System.out.println(obj2.valor); // imprime 5
		 
		 //---------------------------------------------------------------------------
	     /**
	      * Duas referências são consideradas iguais somente se elas estão apontando para o mesmo objeto.
	      *  Mesmo que os objetos que elas apontem sejam iguais, ainda são referências para objetos diferentes:
	      * */
	     Objeto a1 = new Objeto();
	     a1.valor = 5;

	     Objeto b1 = new Objeto();
	     b1.valor = 5;

	     System.out.println(a1 == b1); // false! porque os objetos são diferentes.
	     
	     Objeto c1 = a1;
	     
	     System.out.println(c1 == a1); // true poruqe o objeto c1 referencia para objeto a1 e por tanto tem mesmo valor.

	}

}

class Objeto {
    int valor;
}
