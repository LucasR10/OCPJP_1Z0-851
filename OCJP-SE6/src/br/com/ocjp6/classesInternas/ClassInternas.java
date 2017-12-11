package br.com.ocjp6.classesInternas;

public class ClassInternas {
	
	private int x;
	
	public void construieInner() {
		InnerClass classInterna = new InnerClass();
		classInterna.olaMudnfo();
		
	}
	class InnerClass{
		public void olaMudnfo(){
			System.out.println( "Olá ....");
		}
	}
	
	public static void main(String[] args) {
		ClassInternas  c1 = new ClassInternas();
		 c1.construieInner();
		System.out.println( );
		
		//cirasno 
		
		ClassInternas.InnerClass inner = c1.new InnerClass();
         inner.olaMudnfo();
	}

}
