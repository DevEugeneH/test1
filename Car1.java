package org.java.oop;

public class Car1 {
	
	//���
	//�ν��Ͻ� ���(�ʵ�)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	
	
	//final �Լ��� ������ ���ÿ� �ʱ�ȭ �ؾ��Ѵ�. ���� �Ұ�
//	private static final String CITY-"����";	
	public static String CITY;
	
	
	//private setters, getters �ż��� ���� 
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
	
	
	//�ν��Ͻ� ���(�ż���)
	public void instanceMethod1 () {
		System.out.println("�ڵ��� �̸� : " + this.carName);
	}
	
	//�ν��Ͻ� ���(�ż���)
	public void instanceMethod2 () {
		System.out.println("�ڵ��� ���� : " + this.carCoin);
	}
	
	//�ν��Ͻ� ���(�ż���)
	public void instanceMethod3 () {
		System.out.println("�ڵ��� ���� : " + this.carYear);
	}
	
	//�ν��Ͻ� ���(�ż���)
	public void instanceMethod4 () {
		System.out.println("�ڵ��� �ʺ� : " + this.carWidth);
	}
	

}
