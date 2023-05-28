package javaproject;

import java.util.Scanner;

public class Primeno {
public static void main(String[]args) {
	//int n=32;
	int a=0;
	System.out.println("enter no");
	Scanner k=new Scanner(System.in);
	int j = k.nextInt();
	for(int i=2;i<=j-1;i++) {
	if(j%i==0) {
		a=a+1;}}
	if(a==0) {	System.out.println("Prime no");
	}
	else {
	System.out.println("Not a prime no");
	}
}}

