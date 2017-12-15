package com.enthuware.ets.scjp.v6.fundamentos;

public class TopClass_3 {

	
	 public Inner inner1 = new Inner()
	   {
	       public void doA(){ 
	    	   System.out.println("doing A");
	    	}
	    };

	    public void doA() { 
	    	//inner1.doA(); 
	    }
}
//Inner não tem doA();
class Inner {
	   int value;
   
}
