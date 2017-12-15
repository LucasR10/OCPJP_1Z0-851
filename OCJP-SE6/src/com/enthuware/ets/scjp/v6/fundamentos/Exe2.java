package com.enthuware.ets.scjp.v6.fundamentos;

//What will the following code print?
public class Exe2 {

	public static void main(String[] args) {
		int i = 1;
		int j = i++;
		if ((i == ++j) | (i++ == j)) {
			i += j;
		}
		System.out.println(i);
	}
	
}
