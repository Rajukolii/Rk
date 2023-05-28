package javaproject;

public class CC extends Test {

	public static void main(String[] args) {
		
		 CC a = new  CC();
		 
		a.test1();
		a.test();
		
		 

	}
	
   //Override
	public void test () { 
		
		System.out.println("hi i am abstract class method comleted in concrete class"); 
	}
}
