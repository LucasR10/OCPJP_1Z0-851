package com.enthuware.ets.scjp.v6.fundamentos;

public class TestClass1 {
	
	public class A{}
	
	public static class B{} // n�o  posso da new em static
	
	public static void main(String args[])
	{
		class C { }
		
		// pode  
		TestClass1 t = new TestClass1();
		
		TestClass1.A a = t.new A();
		new TestClass1().new A();
		
		new C();
		
		 
		 
		// n�o pode
		//new TestClass().new B(); // B() e static.
		// a classe C(); n�o esta dentro de Test Class.
		//new TestClass().new C();
		
	}
}