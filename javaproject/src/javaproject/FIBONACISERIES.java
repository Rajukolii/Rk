package javaproject;

public class FIBONACISERIES {
public static void main(String[]args) {
	int a=0,b=1,c;
	System.out.println("FirstNo="+a);
	
	for(int i=1;i<=10;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}	
	//System.out.println(c);

}}