package org.java.oop;

public class Calculator1 {
	private int num1;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum1 () {
		return this.num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return this.num2;
	}
	
	public void sum () {
		int sum = this.num1 + this.num2;
		System.out.println("µ¡¼À");
		System.out.println(this.num1 + " + " + this.num2 + " = " + sum );
	}
	
	public int sub () {
//		int divide = this.num1 - this.num2;
		System.out.println("»¬¼À");
		return this.num1 - this.num2;
	}
	public int multi () {
		System.out.println("°ö¼À");
		return this.num1 * this.num2;
	}
	public int div() {
		System.out.println("³ª´°¼À");
		return this.num1 / this.num2;
	}
	
}
