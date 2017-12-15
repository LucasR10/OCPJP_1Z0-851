package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec7 {

	public static void main(String[] args) {
		B b = new B();
		
		boolean val = (b instanceof A); 
		
		
		System.out.println(" Question 7 "+ val  );

	}

}

class A{
	
}

class B extends A{
	
}