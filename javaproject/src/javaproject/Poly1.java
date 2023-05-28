package javaproject;

public class Poly1 {
public static void main(String []args) {
	int n=1234321;int poly=0,k=n,c;
	while(n>0) {
		c=n%10;
		poly=poly*10+c;
		n=n/10;
	}
	if(poly==k) {
		System.out.println("its poly");
		
	}
	else { System.out.println(" NOt poly");	
}
}}
