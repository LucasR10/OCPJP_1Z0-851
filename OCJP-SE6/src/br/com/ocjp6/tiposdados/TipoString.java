package br.com.ocjp6.tiposdados;

public class TipoString {
	
	public static void main(String [] args) {
		//CRIAR UMA STRING
		String compara = "valor";
		String novo = "valor";
		String val = new String("valor");
		
		byte [] bytes = new byte[10];
		String fromAtring = new String(bytes) ;
		System.out.println(fromAtring);
		
		System.out.println(val +"--"+compara);
		System.out.println(val.equals(val));
		System.out.println(val == compara);
		System.out.println(novo == compara);
		System.out.println( novo.compareTo(compara) );// se as strinf for iguas devolve 0
		System.out.println(novo.compareTo(val));
		
		String str = "Ol� onde voc� est� ?";

		
        
        System.out.println( str.compareTo(str) );
		System.out.println(str.length());
		
		//OPRA��ES
		int size = str.length();
		char letra = str.charAt(2); // vai de 0 a length() -1
		String texto = str.toString();
		
		System.out.println("length -"+ size +", charAt - "+ letra +", String - "+ texto );
		
		//LOCALIZA��O
		
		int posicao = str.indexOf("s");//possi��o ou letra
		int ultima = str.lastIndexOf("�");
		boolean vazio = str.isEmpty();
		
		System.out.println( posicao );
		System.out.println( ultima);
		System.out.println( vazio);
		
		
	}

}
