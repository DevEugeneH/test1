package org.java.oop;

//사용자 정의 타입
public class ClassBasic {

	// 필드(속성)
	public String userId; // 인스턴스 멤버
	public String userPw; // 인스턴스 멤버
	public int userAge; // 인스턴스 멤버
	// 캡슐화
	private String projectName; // 인스턴스 멤버,

	// 클래스 멤버(static)
	public static int projectYear;

	// 객체 생성 시 필요한 특수 매서드
	public ClassBasic() {
		System.out.println("생성자(constructor)");
	}

	// 매서드
	// 인스턴스
	public void instanceMethod() {
		System.out.println("인스턴스 매서드");
	}

	// 클래스 매서드,클래스 멤버(static)
	public static void classMethod() {
		System.out.println("클래스 매서드");
	}

	// getters, setters
	// private 멤버(필드)를 초기화 set~
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	// private 멤버(필드)를 get
	public String getProjectName() {
		return this.projectName; //호출한 그 곳에 반환한다.
	}

}
