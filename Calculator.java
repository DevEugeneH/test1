package org.java.oop;

public class Calculator {
	public void add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	public void sub(int num1, int num2) {
		int subt = num1-num2;
		System.out.println(num1 + " - " + num2 + " = " + subt);
	}
	public void multi(int num1, int num2) {
		int multiple = num1*num2;
		System.out.println(num1 + " * " + num2 + " = " + multiple);
	}
	public void div(int num1, int num2) {
		int divide = num1 / num2 ;
		System.out.println(num1 + " / " + num2 + " = " + divide);
	}
	
	public static void staticMethod() {
		System.out.println("static");
	}
}
