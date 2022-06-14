package org.java.oop;

public class Car1Main {
	public static void main(String[] args) {

		Car1.CITY = "Seoul";

		// aCar -> 객체참조변수(생성된 객체의 주소값)
		// 객체생성연산자 -> new
		// 클래스 -> 사용자 정의타입
		Car1 aCar = new Car1();

		aCar.instanceMethod1();

		// 객체의 기본 값을 null이다.

		aCar.carName = "AVANTE";
		aCar.carCoin = 20000000;
		aCar.carYear = 2022;
		aCar.carWidth = 150;

		aCar.instanceMethod1();
		aCar.instanceMethod2();
		aCar.instanceMethod3();
		aCar.instanceMethod4();

		// private member setters
		aCar.setOption1("추가 선택 옵션(기능) : ABS");
		// 매서드의 return 값은 호출(call) 한 곳에 return 된다.
		System.out.println(aCar.getOption1());

		aCar.setOption2("추가 선택 옵션(도색) : Blue");
		System.out.println(aCar.getOption2());

		
		System.out.println("====================");

		Car1 bCar = new Car1();
//		System.out.println(bCar.CITY);

		bCar.carName = "Grangeur";
		bCar.carCoin = 30000000;
		bCar.carYear = 2022;
		bCar.carWidth = 250;

		bCar.instanceMethod1();
		bCar.instanceMethod2();
		bCar.instanceMethod3();
		bCar.instanceMethod4();

		bCar.setOption1("추가 선택 옵션(기능) : Navigation");
		System.out.println(bCar.getOption1());

		bCar.setOption2("추가 선택 옵션(도색) : Red");
		System.out.println(bCar.getOption2());

		System.out.println("====================");

		Car1 cCar = new Car1();
//		System.out.println("양도지역 : " + cCar.CITY);

		cCar.carName = "K5";
		cCar.carCoin = 25000000;
		cCar.carYear = 2027;
		cCar.carWidth = 200;

		cCar.instanceMethod1();
		cCar.instanceMethod2();
		cCar.instanceMethod3();
		cCar.instanceMethod4();

		cCar.setOption1("추가 선택 옵션(기능) : Autonomous Driving");
		System.out.println(cCar.getOption1());

		cCar.setOption2("추가 선택 옵션(도색) : Silver");
		System.out.println(cCar.getOption2());

		System.out.println("====================");

		Car1 dCar = new Car1();

		dCar.carName = "EV6";
		dCar.carCoin = 50000000;
		dCar.carYear = 2023;
		dCar.carWidth = 400;

		dCar.instanceMethod1();
		dCar.instanceMethod2();
		dCar.instanceMethod3();
		dCar.instanceMethod4();

		dCar.setOption1("추가 선택 옵션(기능) : Thermic Rays");
		String option1 = dCar.getOption1();
		System.out.println(option1);

		dCar.setOption2("추가 선택 옵션(도색) : Black");
		String option2 = dCar.getOption2();
		System.out.println(option2);

	}
}
