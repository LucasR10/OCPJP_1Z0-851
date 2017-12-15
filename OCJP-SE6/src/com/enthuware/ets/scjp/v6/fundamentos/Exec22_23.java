package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec22_23 {

	 public static void main(String[] args) {
		
		 calssA a = new calssA();
		 classB b = new classB();
		 
		 System.out.println(a.hashCode() == b.hashCode() );//hashCode () pode ser substituído.
		 
		 //boolean v = a == b;
		
		 //boolean equals(Object o) is a method in java.lang.Object. It is not an operator.
		  a.equals("") ;
		  
		  /*
		   Para turnos à esquerda, não há diferença entre valores de mudança de assinatura e não assinados, de modo que existe apenas um leftshift '<<' em java.
		   */
	}
}

class calssA{}

class classB{}