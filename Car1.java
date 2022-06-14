package org.java.oop;

public class Car1 {
	
	//멤버
	//인스턴스 멤버(필드)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	
	
	//final 함수는 생성과 동시에 초기화 해야한다. 변경 불가
//	private static final String CITY-"서울";	
	public static String CITY;
	
	
	//private setters, getters 매서드 생성 
	private String option1;
	private String option2;
	
	//option1 setters, getters
	public void setOption1 (String option1) {
		this.option1 = option1;
	}
	public String getOption1 () {
		return this.option1;
	}
	
	//option2 setters, getters
	public void setOption2 (String option2) {
		this.option2 = option2;
	}
	public String getOption2 () {
		return this.option2;
	}
	
	
	//인스턴스 멤버(매서드)
	public void instanceMethod1 () {
		System.out.println("자동차 이름 : " + this.carName);
	}
	
	//인스턴스 멤버(매서드)
	public void instanceMethod2 () {
		System.out.println("자동차 가격 : " + this.carCoin);
	}
	
	//인스턴스 멤버(매서드)
	public void instanceMethod3 () {
		System.out.println("자동차 연식 : " + this.carYear);
	}
	
	//인스턴스 멤버(매서드)
	public void instanceMethod4 () {
		System.out.println("자동차 너비 : " + this.carWidth);
	}
	

}
