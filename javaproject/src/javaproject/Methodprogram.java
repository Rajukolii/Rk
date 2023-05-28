package javaproject;

public class Methodprogram {
	
	public static void Homeloan()
	{ 
		System.out.println("my central bank home loan");
	}
	
	public void Carloan()
	{
		System.out.println("my car loan from SBI");
	}

	public static void main(String[] args)
	{
	  Methodprogram.Homeloan();
	  
	   Methodprogram a1 = new Methodprogram();
	   a1.Carloan();

	}

}
