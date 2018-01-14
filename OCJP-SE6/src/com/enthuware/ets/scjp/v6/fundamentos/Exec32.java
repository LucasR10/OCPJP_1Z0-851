package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec32 {

	public static void main(String[] args) {
		String s = "going";
	    print(s,  s = "gone");
	    
	    int x = 1;
		print(x, x = 3 + 5 );
		

	}
static void print(String a, String b){
	      System.out.println(a +", "+ b );
}


static void print(int a, int b){
	int x;
    System.out.println(a +", "+ b );
}
}
