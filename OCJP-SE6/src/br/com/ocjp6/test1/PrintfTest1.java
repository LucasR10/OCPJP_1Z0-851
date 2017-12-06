package br.com.ocjp6.test1;

public class PrintfTest1 {
	
	 public static void main(String[] args) {
		
		 /**
		  * Formatação de strin com printf.
		  * b - boolean
		  * c - char
		  * d - integer
		  * f - floating point
		  * s - String
		  * 
		  * */
		 double x = 123.456;
		 char   c = 65;
		 int    i = 65;
		 
		 System.out.printf("%s \n", x);// string 123.456
		 System.out.printf("%b \n", x);//true
		 System.out.printf("%c \n", c);//A
		 System.out.printf( "%5.2f \n",x);// .2f // casas decimais.
		 System.out.printf("%d \n", i);//integer 65
		 
	/*	System.out.printf("%b",x);//boolen
		System.out.printf("\n");
		System.out.printf("%c",c);//char
		System.out.printf("\n");
		System.out.printf("%d",i);// integer
		System.out.printf("\n");
		System.out.printf("%f",x);//ponto flutuante
		System.out.printf("\n");
		System.out.printf("%s",s);//String
*/	}

}
