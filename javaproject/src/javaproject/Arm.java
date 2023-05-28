package javaproject;

import java.util.Scanner;

public class Arm {
public static void main(String []args) {
	
	Scanner j=new Scanner(System.in);
	System.out.println("enter no.");
	int  arm=0;int c; 
	int n = j.nextInt();
	int k=n;
	while(n>0) {
		c=n%10;
		arm=arm+(c*c*c);
		n=n/10;
	}
	if (k==arm) {
			System.out.println("armstrog no");
	}
	else { System.out.println("Not a Armstrong  no.");
}
}}
