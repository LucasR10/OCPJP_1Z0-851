package com.enthuware.ets.scjp.v6.fundamentos;

public class Exec6 {

	public static void main(String[] args) {
	
		char varChar = 'A';
		long varLong = varChar;// comverter char em long n�o precissa de cast;
		
		byte varBytes = 41;
		short varShort = varBytes; //comverter byte em short n�o precissa de cast;
		
		short varShortToChar = 300;
		char charFromshort = (char) varShortToChar; // precissa de cast ;
		 
		int varToFloat = 454; 
		float vatFloatFromInt = varToFloat;// n�p precissa porque o float e maio do que o int;

		/**
		 * Comverte byte, short, char em int, long , float n�o precissa de cast;
		 * 
		 * */

	}

}
