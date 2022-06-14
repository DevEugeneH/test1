package org.java.oop;

public class OverLoading {
	// 오버로딩 "매서드 명이 똑같고 매서드 매개 변수 유형이 차이가 있는 매서드 유형"
	// 접근 제한자 반환타입 매서드명(매개변수) { }

	// 선언부
	public void method() {
		// 구현부
		System.out.println("매서드");
	}

	// 반환 타입과 상이해도 오비로딩 성립되지 않는다.
//	public int method () {
//		return 0;
//	}
	public void method(int num1, String name) {
		System.out.println(name + num1);
	}

	public void method(int num1) {
		System.out.println(num1);
	}
	// 매개 변수의 이름이 달라도 타입이 같으면 같은 매서드 취급
//	public void method(int num2, String name) {
//		System.out.println(name+num2);
//	}

	public void method(String name, int num1) {
		System.out.println(name + num1);
	}

}
