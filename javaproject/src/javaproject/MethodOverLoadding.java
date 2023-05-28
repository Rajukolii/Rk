package javaproject;

public class MethodOverLoadding {
	
	long a = 100000; // two methods with same name but different agrunment is called method over loading
	
    public void mahadev (String name,String DOB) { 
    	
    	System.out.println("bhushan "+ name + "\n" + "25/6/94"+ DOB);
    }
    public void mahadev (int a,int b) { 
    	
    	System.out.println("package" + a + "\n" + "month" + b);
    	
    }
    public static void main(String[] args) {
		
    	MethodOverLoadding v = new MethodOverLoadding();
    	v.mahadev(20000,1000);
    	v.mahadev("bunty", "ok");
    	System.out.println(v.a);
    	
    	MethodOverLoadding a = new MethodOverLoadding ();
    	
    	a.mahadev(150000,3);
    	a.mahadev("patil","-DOB");
    	
    	
    	
    	
    	
	}

}