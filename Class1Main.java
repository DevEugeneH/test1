package org.java.oop;

public class Class1Main {
	public static void main(String[] args) {

		Class1.classMethod();
		// �ν��Ͻ�ȭ(��üȭ)
		// new ��ü���� ������
		// c1 ��ü�� �ּ�
		// ��ü. -> ��ü ���� ������
		Class1 c1 = new Class1();
		//c1 -> num1,num2,key�� �ʱ�ȭ ��ȣ �ֿܼ� ���
		c1.num1 = 1111;
		c1.num2 = 2222;
		
		//����ʱ�ȭ
		c1.setKey("Key2"); //private setters
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getKey());
		
		//Ŭ���� ��� static -> �ν��Ͻ� ���� ���� ���
		System.out.println(Class1.PROJECTNAME);
		c1.instanceMethod();
		c1.instanceMethod2();
		
	}
}
