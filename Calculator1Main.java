package org.java.oop;

import java.util.Scanner;

public class Calculator1Main {
	public static void main(String[] args) {
		
		Calculator1 cal = new Calculator1();
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("ù��° ���� �Է�");
			int num1 = scn.nextInt();
			
			System.out.println("�ι�° ���� �Է�");
			int num2 = scn.nextInt();
			
			System.out.println("������ �Է�");
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
				System.out.println("�����մϴ�.");
				break;
			} else { 
				System.out.println("�Է� ����");
			}
		}
		scn.close();
	}
}
