package org.java.oop;

public class FieldMain {
	public static void main(String[] args) {
		System.out.println("프로젝트명 : " + Field.PROJECTNAME);

		// 일반 변수 ->
		// 객체 타입 변수 ->
		Field c1 = new Field();
		System.out.println(c1);
	
		Field c2 = new Field();
		System.out.println(c2);
	}
}
