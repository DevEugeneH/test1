package org.java.oop;

public class Class1 {

	// ���(�ʵ�)
	public int num1; // �ν��Ͻ� ���
	public int num2;
	private String key;
	public static final String PROJECTNAME = "JAVAPROJECT2022";

	public void instanceMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �ż���");
	}

	public int instanceMethod2() {
		System.out.println("return���� int�� �ν��Ͻ� �ż���");
		return this.num1 + this.num2;
	}

	public static void classMethod() {
		System.out.println("Ŭ���� �ż���");
	}

	// setters -> private ��� �ʱ�ȭ
	public void setKey(String key) {
		this.key = key;
	}

	// getters -> private ��� get
	public String getKey() {
		return this.key;
	}

}
