package br.com.ocjp6.tiposdados;

public class ExecAlura {

	public static void main(String[] args) {
		
		   /**
		    * Imprime 48, pois a atribui��o de objetos � feita por c�pia da refer�ncia, criamos somente um �nico objeto do tipo B
		    * 
		    * */
		    B x = new B();
	        B y = x;// aqui y 15
	        y.v++;// aqui y 16
	        x.v++;// como o valor e por referencia o valor de y.v =16 tambem sera mesmo para o objeto x porntanto x.v = 17
	        B z = y;
	        z.v--;
	        System.out.println(x.v + y.v + z.v);
		
	}
	
}

class B {
    int v = 15;
}
