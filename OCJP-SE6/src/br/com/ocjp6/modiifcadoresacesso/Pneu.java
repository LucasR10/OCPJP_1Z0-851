package br.com.ocjp6.modiifcadoresacesso;

public class Pneu extends Circulo {

	public static void main(String[] args) {
		
		Pneu p = new Pneu();
	  //  p.raio = 10.0; //Erro de compila��o. O Atributo raio � privado da classe Circulo
	   // p.setRaio(10.0); //Correto, pois a classe Pneu est� utilizando os m�todos definidos na classe Circulo para fazer
	                     //acesso ao atributo privado raio 
		
	}

}
