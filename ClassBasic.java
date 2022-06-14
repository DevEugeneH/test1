package org.java.oop;

//����� ���� Ÿ��
public class ClassBasic {

	// �ʵ�(�Ӽ�)
	public String userId; // �ν��Ͻ� ���
	public String userPw; // �ν��Ͻ� ���
	public int userAge; // �ν��Ͻ� ���
	// ĸ��ȭ
	private String projectName; // �ν��Ͻ� ���,

	// Ŭ���� ���(static)
	public static int projectYear;

	// ��ü ���� �� �ʿ��� Ư�� �ż���
	public ClassBasic() {
		System.out.println("������(constructor)");
	}

	// �ż���
	// �ν��Ͻ�
	public void instanceMethod() {
		System.out.println("�ν��Ͻ� �ż���");
	}

	// Ŭ���� �ż���,Ŭ���� ���(static)
	public static void classMethod() {
		System.out.println("Ŭ���� �ż���");
	}

	// getters, setters
	// private ���(�ʵ�)�� �ʱ�ȭ set~
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	// private ���(�ʵ�)�� get
	public String getProjectName() {
		return this.projectName; //ȣ���� �� ���� ��ȯ�Ѵ�.
	}

}
