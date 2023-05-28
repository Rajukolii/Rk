package javaproject;

public class Arm1 {
	public static void main(String[]args) {
		
		int n=370,arm=0,c,k=n;
		while(n>0) {
			c=n%10;
			arm=arm+(c*c*c);
			n=n/10;
		}
		if(k==arm){
			System.out.println("armmstrong no");
		}
		else {
			System.out.println("Not a No.");
		}

}}
