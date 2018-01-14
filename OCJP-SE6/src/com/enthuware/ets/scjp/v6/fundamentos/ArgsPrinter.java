package com.enthuware.ets.scjp.v6.fundamentos;
public class ArgsPrinter {

  int	int123;
  static public  void main(String[] args) {
		main("1");
		main("2");
		main("3");
		main("4");
	}
	public static void main(String args)
	{
		for(int i=0; i<3; i++)
		{
			System.out.println(args);
		}
	}

}
