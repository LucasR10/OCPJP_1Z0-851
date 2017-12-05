package br.com.ocjp6.exemplos;
import org.junit.Test;

public class EXmplos {

	@Test
	public void execute() {


		for(Card c : Card.values()) System.out.print(c+" ");
	}
}

enum Card {
	HEART, CLUB, SPADE, DIAMOND;
}


