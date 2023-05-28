package javaproject;

public class ReverseString {
	public static void main(String []args) {
 String k=new String("RajaRani");
 String k1=new String("cha sansar");
 String s="Ram";
 String s1="RajaRani";
 String s2="RajaRani";
 String k2=new String("RajaRani");
//for(int i=k.length()-1;i>=0;i--) {
	//System.out.print(k.charAt(i));
		System.out.println(k.concat(k1));
		System.out.println(s.replace("R","5"));
		System.out.println(s2==s1);
		System.out.println(k.equals(k2));
		System.out.println(k1.toUpperCase());
		System.out.println(s2.toLowerCase());
	boolean j = k1.startsWith("ch");
	System.out.println(s2.startsWith("jar"));
	System.out.println(s2.concat(k1));
	System.out.println(s1.replace("Raja", "ramu"));
	System.out.println(s1.indexOf("i"));
	System.out.println(s1.charAt(5));
	System.out.println(s1.charAt(6));
	System.out.println(s1.charAt(3));
}
}
