package org.java.oop;

public class ClassMethodMain {
	

	public static void main(String[] args) {

		ClassMethod c1 = new ClassMethod();

		c1.method1(); // 매서드 call(호출)
		c1.method2(100, 200);

		int sum = c1.method3();
		System.out.println(c1.method3());
		System.out.println(sum);

		int sum1 = c1.method4(100, 200);
		System.out.println(sum1);
		System.out.println(c1.method4(300, 400));

		// 클래스 매서드 호출
		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(100, 200);
	}
}
