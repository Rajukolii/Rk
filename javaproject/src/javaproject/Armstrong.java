package javaproject;

public class Armstrong {
public static void main(String[]args) {
	int n=370,arm=0,c,k=n;
	while(n>0) {
		c=n%10;  //1 7 3
		arm=arm+(c*c*c);//1 344 27
		n=n/10;//37 3 0
	}
	if(k==arm) {
		System.out.println("armstrong no");
	}
	else {
		System.out.println("Not a Armstrong no");
	}
}
}
 