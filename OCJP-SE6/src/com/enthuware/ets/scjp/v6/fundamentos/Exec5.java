package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec5 {


	public static void main(String args[]) {
		Student s = new Student("Vaishali", "930012");
		s.grade();
		System.out.println(s.getName());
		s = null;//  pode ser  coletado. 
		s = new Student("Vaishali", "930012");
		s.grade();
		System.out.println(s.getName());
		s = null;
	}

	
	
}
