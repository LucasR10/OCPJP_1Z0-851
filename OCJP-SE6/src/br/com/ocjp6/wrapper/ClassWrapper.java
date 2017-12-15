package br.com.ocjp6.wrapper;

public class ClassWrapper {
	
	
	public static void main(String[] args) {
		
		 WrapperInteger wInt = new WrapperInteger();
		 Integer valorInt = new Integer(5);
		 wInt.getValor( valorInt  );
		 
		 System.out.println( "Valor  Wrapper Intget "+ valorInt );
		 System.out.println( "Valor  Wrapper Int  "+ wInt.getValorPrimitivo(5));
		 
		 WrapperDouble wrapperDouble = new WrapperDouble();
		 Double d = wrapperDouble.getValor(  new Double(45.5) );
		 
		 System.out.println(" double "+ d );
		 System.out.println(" double "+ wrapperDouble.getdoublePrimitivo(5.1) );
		 
	}

}

/*
	 Tipo primitivo	Empacotadora (Wrapper)	Argumentos suportados
		byte	 Byte	 byte or String
		short	Short	short or String
		int	Integer	int or String
		long	Long	long or String
		float	Float	float, double or String
		double	Double	double or String
		char	Character	char
		boolean	Boolean	boolean or String
*/

class  WrapperInteger {
	
	public Integer getValor(Integer x) {
		x++; //valor imutavel;
		return x; 
	}
	
	
	public int getValorPrimitivo(int x) {
		x++; //valor mutavel;
		return x; 
	}
}


class  WrapperDouble {
	
	public Double getValor(Double x) {
		x++; //valor imutavel;
		return x; 
	}
	
	
	public double getdoublePrimitivo(double x) {
		x++; //valor mutavel;
		return x; 
	}
}