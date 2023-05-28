package javaproject;

public class Poli {
public static void main(String[]args) {
	
	
	int n=121;
	int poly=0;
	int c;
	int k=n;
	
	while(n>0) {
		c=n%10;   //1
		poly=poly*10+c;
		n=n/10;//1
	}
	if(k==poly) {
		System.out.println("given no. is poly");
	}
	else {
		System.out.println("not a poly");
	}
	}



}
