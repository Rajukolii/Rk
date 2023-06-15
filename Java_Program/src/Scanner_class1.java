import java.util.Scanner;

public class Scanner_class1 {

	public static void main(String[] args) {
		
		Scanner Myobj = new Scanner (System.in);
		
		System.out.println("Enter first number");
		String a = Myobj.next();
	
		
		System.out.println("Enter second number");
		
		int b = Myobj.nextInt();
		
		String  c = a+b;
		
		
		System.out.print("total is"+c);
		
	}
}


