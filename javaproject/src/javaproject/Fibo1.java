package javaproject;

public class Fibo1 {
public static void main(String []args) {
	int a;int b=0,c=1;
	for(int i=0;i<10;i++) {
		
		a=b+c;
		System.out.println(a);
		b=c;
		c=a;
	}
}
}
