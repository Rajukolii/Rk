package javaproject;

public class Prime2 {
	public static void main(String[]args) {
	//int n=17;int a=0;
	//for(int i=2;i<=n-1;i++) {
	//	if(n%i==0) {
	//		a=a+1;
	//	}}
	//	if(a==0) {
	//		System.out.println("prime");
	//	}
		//else {
	//		System.out.println("not");
		//}
		int n=7,k=0;
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
			k=k+1;
		}
	}
	if(k==0) {
		System.out.println("prime ");
	}
	else {System.out.println("no");
}}}
