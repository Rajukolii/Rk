package javaproject;

public class RevString {
public static void main(String[]args) {
String k="ABCDEFG";
for(int i=k.length()-1;i>=0;i--) {
	char j = k.charAt(i);
	System.out.println("Reverse values are+"+j);
}
}
}

