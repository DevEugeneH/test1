package org.java.oop;

public class Class1Main {
	public static void main(String[] args) {

		Class1.classMethod();
		// 인스턴스화(객체화)
		// new 객체생성 연산자
		// c1 객체의 주소
		// 객체. -> 객체 접근 연산자
		Class1 c1 = new Class1();
		//c1 -> num1,num2,key를 초기화 기호 콘솔에 출력
		c1.num1 = 1111;
		c1.num2 = 2222;
		
		//멤버초기화
		c1.setKey("Key2"); //private setters
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		System.out.println(c1.getKey());
		
		//클래스 멤버 static -> 인스턴스 생성 없이 사용
		System.out.println(Class1.PROJECTNAME);
		c1.instanceMethod();
		c1.instanceMethod2();
		
	}
}
