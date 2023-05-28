package javaproject;

public class Calculator {
public static double doOperation(double num1,double num2,String operation){
	switch(operation) {
	case"add":
		return addCriteria(num1,num2);
	case"substract":
		return subCriteria(num1,num2);
	case"multiply":
		return mulCriteria(num1,num2);	
	default:
		return divCriteria(num1,num2);	
	}
	
}

public static double addCriteria(double firstNum,double secondNum) {
	double result=firstNum + secondNum;
	return result;}

public static double subCriteria(double firstNum,double secondNum) {
	double result=firstNum - secondNum;
	return result;}
public static double mulCriteria(double firstNum,double secondNum) {
	double result=firstNum * secondNum;
	return result;}
public static double divCriteria(double firstNum,double secondNum) {
	double result=firstNum / secondNum;
	return result;}
public static void main(String[]args) {
	System.out.println("Result is;"+doOperation(12,8,"add"));
}}
