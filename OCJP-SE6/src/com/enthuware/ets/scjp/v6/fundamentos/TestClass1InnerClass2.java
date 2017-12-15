package com.enthuware.ets.scjp.v6.fundamentos;

public class TestClass1InnerClass2 {
	
	public class A extends B{}
	
	public static class B{} // não  posso da new em static
	
	public final static class D{} // não  posso da new e nem extends em calse static e final
	
	public class E extends Exception  {}// classe aninhada pode extends de qualquer class não seja final.
	
	public static void main(String args[])
	{
		class C { }
		
		// pode  
		TestClass1InnerClass2 t = new TestClass1InnerClass2();
		
		TestClass1InnerClass2.A a = t.new A();
		new TestClass1InnerClass2().new A();
		
		new C();
		
		 
		 
		// não pode
		//new TestClass().new B(); // B() e static.
		// a classe C(); não esta dentro de Test Class.
		//new TestClass().new C();
		
	}
}