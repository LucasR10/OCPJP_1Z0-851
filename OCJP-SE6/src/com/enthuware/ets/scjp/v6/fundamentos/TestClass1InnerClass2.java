package com.enthuware.ets.scjp.v6.fundamentos;

public class TestClass1InnerClass2 {
	
	public class A extends B{}
	
	public static class B{} // n�o  posso da new em static
	
	public final static class D{} // n�o  posso da new e nem extends em calse static e final
	
	public class E extends Exception  {}// classe aninhada pode extends de qualquer class n�o seja final.
	
	public static void main(String args[])
	{
		class C { }
		
		// pode  
		TestClass1InnerClass2 t = new TestClass1InnerClass2();
		
		TestClass1InnerClass2.A a = t.new A();
		new TestClass1InnerClass2().new A();
		
		new C();
		
		 
		 
		// n�o pode
		//new TestClass().new B(); // B() e static.
		// a classe C(); n�o esta dentro de Test Class.
		//new TestClass().new C();
		
	}
}