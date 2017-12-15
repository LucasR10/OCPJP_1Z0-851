package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec25 {

	public static void main(String[] args) {
		
		Integer i1 =1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;
		
//		i1 == i2 will return false because both are pointing to tow different object.
//		i1 == i3 will return true because one operand is a primitive int and so the other will be unboxed and then the value will be compared.
//		i1 == b1 will not even compile because type of i1 and b1 references are classes that are not in the same class hierarchy. 
//      So == knows at compile time itself that they can't point to the same object.
//		i1.equals(i2) will return true because both are Integer objects and both have the value 1.
////	i1.equals(b1) and i1.equals(g1) will return false because they are pointing to objects of different types.
//		
		boolean b = i1 == i2; // false
		boolean c = i1 == i3;// true
//		boolean d = i1 == b1;// não compila porque são valores diferente.
		i1.equals(i2);// true
		i1.equals(g1);// false
		

	}

}
