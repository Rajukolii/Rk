package javaproject;

public class Methodclass2 {
	
	public static void method3 ()
	{
	System.out.println("method 3 is running");	
		
	}
	public void method4 ()
	{
		System.out.println("method 4 is running");
	}
	public static void main(String[] args) {
		
      Methodclass2.method3();
		
		Methodclass2 a1 = new Methodclass2();
		a1.method4();
		
	Methodclass1.method1();
	
	Methodclass1 b1 = new Methodclass1();
	b1.method2();
				
	}

}
