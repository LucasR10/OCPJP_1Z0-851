package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec19 {

	public static void main(String[] args) {
		
		OurClass o = new OurClass();
		
		Boolean t1 = o instanceof YourClass;
		System.out.println( t1 );
		
		Boolean t2 = o instanceof MyClass;
		System.out.println( t2 );
		
		YourClass uClass = o;
		YourClass uClass2 = new MyClass();
		
		MyClass class1 = new OurClass();
		
	}

}

 class OurClass extends MyClass{}
 
 class MyClass extends YourClass{}
 
 class YourClass{
	 public void go() {}
	 
 }