package stringarr;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String []arr=new String[3];
		arr[0]="Raju";
		arr[1]="golu";
		arr[2]="khushbu";
		System.out.println(arr.length);
		System.out.println(arr[2]);
		Arrays.sort(arr);
		
		for(int i=0;i<=2;i++) {
			System.out.println(arr[i]);
			
		}
		for(int j=arr.length-1;j>=0;j--) {
			System.out.println(arr[j]);
			
		}
	}

}
