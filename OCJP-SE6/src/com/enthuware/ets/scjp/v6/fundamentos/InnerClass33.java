package com.enthuware.ets.scjp.v6.fundamentos;


public class InnerClass33 {
    private double d = 10.0;
    
    
class Inner {
      int x;
      
      public void m1() { 
    	 // this.d = 20.0; erro por d não e da inner 
    	  this.x = 10;//ok
    }
      
      abstract class Inner1
      {
        public void m1() {  d = 20.0;  }
      }
      
      final class Inner3
      {
        public void m1() {  d = 20.0;  }
      }
      
      private class Inner4
      {
        @SuppressWarnings("unused")
		public void m1() {  d = 20.0;  }
      }

 }

}
