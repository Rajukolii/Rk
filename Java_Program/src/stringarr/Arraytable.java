package stringarr;

import java.util.Arrays;

public class Arraytable {
public static void main(String[] args) {
	int a[][] =new int[2][3]; 
	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=130;
	a[1][0]=40;
	a[1][1]=50;
	a[1][2]=60;
	System.out.println(a[1][2]);
	for (int i=0;i<=1;i++) {
		for(int j=0;j<=2;j++) {
			System.out.print(a[i][j]+" ");
			
			
		}
	}
	System.out.println("----------------------------------------");
	Arrays.sort(a);
	System.out.println(a[0][0]); 
}
}
