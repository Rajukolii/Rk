package javaproject;

public class Primenolist {
	public static void main(String[]args) {
		for(int j=1;j<=100;j++) {
		int a=0;
		for(int i=2;i<=j-1;i++) {
			if(j%i==0) {
				a=a+1;
			}
	}
if (a==0) {
	System.out.println("prime"+j);
}
//else {
	
	
	//System.out.println("not prime"+j);
//}
}}
}