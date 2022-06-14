package org.java.oop;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator.staticMethod();
		
		Calculator cal = new Calculator();

		cal.add(200, 300);
		cal.sub(200, 100);
		cal.multi(200, 30);
		cal.div(400, 500);
		

		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = scn.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scn.nextInt();

		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.div(num1, num2);
		cal.multi(num1, num2);

		scn.close();
	}
}
