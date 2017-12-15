package com.enthuware.ets.scjp.v6.fundamentos;

public class TestClassExec13 {
	/*
	 * 
		1. Os objetos do wrapper são sempre imutáveis. Portanto, quando o dataWrapper é passado no método wiggler (), 
		ele nunca é alterado mesmo quando x ++; É executado. No entanto, x, que estava apontando para o mesmo objeto como dataWrapper,
		é atribuído um novo objeto Integer (diferente do dataWrapper) contendo 6.
		2. Se ambos os operandos do operador + forem numéricos, ele adiciona os dois operandos.
		Aqui, os dois operandos são Integer 5 e Integer 15, então ele os descompila, os adiciona e imprime 20.hort?
	 * 
	 * */
	
	public static Integer wiggler(Integer x) {
		Integer y = x + 10;
		x++;// obejto imutavel
		System.out.println(x);
		return y;
	}

	public static void main(String[] args) {
		Integer dataWrapper = new Integer(5);
		Integer value = wiggler(dataWrapper);
		System.out.println(dataWrapper + value);
	}

}
