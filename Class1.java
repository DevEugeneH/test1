package org.java.oop;

public class Class1 {

	// 멤버(필드)
	public int num1; // 인스턴스 멤버
	public int num2;
	private String key;
	public static final String PROJECTNAME = "JAVAPROJECT2022";

	public void instanceMethod() {
		System.out.println("return이 없는 인스턴스 매서드");
	}

	public int instanceMethod2() {
		System.out.println("return값이 int인 인스턴스 매서드");
		return this.num1 + this.num2;
	}

	public static void classMethod() {
		System.out.println("클래스 매서드");
	}

	// setters -> private 멤버 초기화
	public void setKey(String key) {
		this.key = key;
	}

	// getters -> private 멤버 get
	public String getKey() {
		return this.key;
	}

}
