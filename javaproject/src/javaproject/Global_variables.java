package javaproject;

public class Global_variables {
	
	int a = 20;//declared inside the class and outside the body
	int b = 40;
	
	public  void global () {
		
		int c = a+b;
		
		System.out.println(c);
		
	}
   public static void main(String[] args) {
		
	   Global_variables v = new Global_variables ();
	   
	   v.global();
	}

}
