package com.enthuware.ets.scjp.v6.fundamentos;


//class A is not static inner class of TestClass. So it cannot exist without an outer instance of TestClass.
//class B is static inner class and can be instantiated without an outer instance of TestClass.
//Now, the method useclasses() is an instance method. So, it already has instance of outer class associated with it. So, new A(); is also valid. new TestClass.A(); is same as new A().
////Although not related to this question, unlike popular belief and unlike mentioned in various books, anonymous class can never be static. Even if created in a static method.

public class TestClass1InnerClass26 {

	public class A {
	}

	public static class B {
	}

	public void useclasses() {
//		new TestClass().new A();
//		new TestClass.B();
//		new A(); nem um acima complia

	}
}