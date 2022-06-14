package org.java.oop;

import java.util.Scanner;

public class Calculator1Main {
	public static void main(String[] args) {
		
		Calculator1 cal = new Calculator1();
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("첫번째 숫자 입력");
			int num1 = scn.nextInt();
			
			System.out.println("두번째 숫자 입력");
			int num2 = scn.nextInt();
			
			System.out.println("연산자 입력");
			String op = scn.next();
			
			cal.setNum1(num1);
			cal.setNum2(num2);
			
			if (op.equals("+")) {
				cal.sum();
			} else if (op.equals("-")) {
				System.out.println(cal.getNum1() + " - " + cal.getNum2() + " = " + cal.sub());
			} else if (op.equals("*")) {
				System.out.println(cal.getNum1() + " * " + cal.getNum2() + " = " + cal.multi());
			} else if (op.equals("/")) {
				System.out.println(cal.getNum1() + " / " + cal.getNum2() + " = " + cal.div());
			} else if (op.equals("z")) {
				System.out.println("종료합니다.");
				break;
			} else { 
				System.out.println("입력 오류");
			}
		}
		scn.close();
	}
}
