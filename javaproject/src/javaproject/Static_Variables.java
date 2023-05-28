package javaproject;

public class Static_Variables {
	
	static int a = 10;// his static variables
	static int b = 20;
	
	public static void local() { // static method
		
		int c = b-a;
		
		System.out.println(c);
	}
	
	public void global () { // non static method 
	
		int d = a/b;
		
		System.out.println(d);
	
	}
	public static void main(String[] args) {
		
		local();                                       //static method calling
		Static_Variables a = new Static_Variables();
		
		a.global();                         // non static method calling
	}

}
