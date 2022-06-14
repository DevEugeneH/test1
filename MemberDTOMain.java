package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDTOMain {
	public static void main(String[] args) {
		
		MemberDTO mem1 = new MemberDTO();
		
		mem1.setUserId("root");
		mem1.setuserPw("1111");
		mem1.setUserName("ȫ�浿");
		mem1.setUserAge(27);
		mem1.setUserAddr("����Ư���� �����");
		mem1.setUserPhone("010-1234-1234");
		mem1.setDay(new Date()); //���� �ð�
		
		
		String userId = mem1.getUserId();
		String userPw = mem1.getUserPw();
		String userName = mem1.getUserName();
		int userAge = mem1.getUserAge();
		String userAddr = mem1.getUserAddr();
		String userPhone = mem1.getUserPhone();
		Date day = mem1.getDay();
		
		SimpleDateFormat sDay = new SimpleDateFormat ("yyyy:MM:dd:hh:mm:ss");
		String now = sDay.format(day);
		
		System.out.println("���̵� : " + userId);
		System.out.println("��й�ȣ : " + userPw);
		System.out.println("�̸� : " + userName);
		System.out.println("���� : " + userAge);
		System.out.println("�ּ� : " + userAddr);
		System.out.println("�ڵ�����ȣ : " + userPhone);
		System.out.println("��¥ : " + now);
		
		
		
		System.out.println(mem1.toString());
		MemberDTO mem2 = new MemberDTO();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���");
		mem2.setUserId(scn.next());
		
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		mem2.setuserPw(scn.next());
		
		System.out.println("�̸��� �Է��ϼ���.");
		mem2.setUserName(scn.next());
		
		System.out.println("���̸� �Է��ϼ���.");
		mem2.setUserAge(scn.nextInt());
		
		System.out.println("�ּҸ� �Է��ϼ���.");
		mem2.setUserAddr(scn.next());
		
		System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���.");
		mem2.setUserPhone(scn.next());
		
		mem2.setDay(new Date()); //���� �ð�
		String day2 = sDay.format(new Date());
		
		
		System.out.println("���̵� : " + mem2.getUserId());
		System.out.println("��й�ȣ : " + mem2.getUserPw());
		System.out.println("�̸� : " + mem2.getUserName());
		System.out.println("���� : " + mem2.getUserAge());
		System.out.println("�ּ� : " + mem2.getUserAddr());
		System.out.println("�ڵ��� ��ȣ : " + mem2.getUserPhone());
		System.out.println("���� �ð� : " + day2);
		
		scn.close();
	}
}
