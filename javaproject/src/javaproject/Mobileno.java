package javaproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobileno {
public static void main(String[]args) {
	String mbno ="8999092278";
	Pattern p=Pattern.compile("[0-9]{10}");
	Matcher m=p.matcher(mbno);
        m.group();
        if(m.find()&& m.group().equals(mbno)) {
        System.out.println("valid mobile no");}
        else {
        	System.out.println("invalid mobile no");
}}}
