package javaproject;

public class Nested_if {
	
	int age = 19;
	int height = 160;
	int weight = 58;
	
	public void blood ()
	{
		if(age>25)
		{ 
			System.out.println("first criteria met");
		}
	
	if(height>159)
	{ 
		System.out.println("second criteria met");
	}
	if(weight>57)
	{ 
		System.out.println("eligible foor blood donation");
	}

	}
	public static void main(String[] args) {
		
		Nested_if c = new Nested_if();
		 c.blood();

	}

}
