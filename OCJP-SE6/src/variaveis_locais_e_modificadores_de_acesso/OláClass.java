package variaveis_locais_e_modificadores_de_acesso;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ol·Class {

	public static void main(String[] args) {
			int k = 5/0;
			System.out.println(k);
			
			
		}
}

class Super
{
  public int getNumber( int a)
  {
     return 2;
     
  }
}
 class SubClass extends Super
{
  public int getNumber( int a, char ch)
  {
     return 4;
  }
  public static void main(String[] args)
  {
    System.out.println( new SubClass().getNumber(4) );
    try {
    	
    }finally {
		
	}
  }
}

class SomeClass
{
   public static void main(String args[])
   {
	   
//	   char c = 320;float f = 320; double d = 320; byte b = 320;
      int size = 10;
      int[] arr = new int[size];
      for (int i = 0 ; i < size ; ++i)
    	  System.out.println(arr[i]);
   }
}


class Test
{
   public static void main(String args[])
   {
	   Map<Book, Integer> map = new HashMap<Book, Integer>();   
	  //  map.get()
      int k = 9, s = 5;
      switch(k)
      {
         default :
         if( k == 10) { s = s*2; }
         else
         {
            s = s+4;
            break;
         }
         case 7 : s = s+3;
      }
      System.out.println(s);
   
       
   }
}



 class TestOuter
{
	public void myOuterMethod()
	{
		// 1
	}
	public class TestInner { }
	public static void main(String[] args)
	{
//		TestOuter to = new TestOuter();
//		new TestOuter().new TestInner(); 
//		new TestOuter.TestInner(); 
	}
	
	public Object  myMethod() { return "";}
}
 
 class TestClass extends Thread
 {
    public void run()
    {
       for(;;);
    }
    public static void main(String args[])
    {
    	System.out.println('b'+new Integer(63));
       System.out.println("Starting Main");
       new TestClass().start();
       System.out.println("Main returns");
    }
 }
 
 interface i{}
 interface i1 extends i{}


class TestClass2
{
    public static void main(String args[ ] )
    {
       int i = 1;
       int[] iArr = {1};
       incr(i) ;
       incr(iArr) ;
       System.out.println( "i = " + i + "  iArr[0] = " + iArr [ 0 ] ) ;
    }
    public static void incr(int   n ) { n++ ; }
    public static void incr(int[ ] n ) { n [ 0 ]++ ; }
}
