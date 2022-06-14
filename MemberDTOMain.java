package org.java.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemberDTOMain {
	public static void main(String[] args) {
		
		MemberDTO mem1 = new MemberDTO();
		
		mem1.setUserId("root");
		mem1.setuserPw("1111");
		mem1.setUserName("홍길동");
		mem1.setUserAge(27);
		mem1.setUserAddr("서울특별시 노원구");
		mem1.setUserPhone("010-1234-1234");
		mem1.setDay(new Date()); //현재 시간
		
		
		String userId = mem1.getUserId();
		String userPw = mem1.getUserPw();
		String userName = mem1.getUserName();
		int userAge = mem1.getUserAge();
		String userAddr = mem1.getUserAddr();
		String userPhone = mem1.getUserPhone();
		Date day = mem1.getDay();
		
		SimpleDateFormat sDay = new SimpleDateFormat ("yyyy:MM:dd:hh:mm:ss");
		String now = sDay.format(day);
		
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPw);
		System.out.println("이름 : " + userName);
		System.out.println("나이 : " + userAge);
		System.out.println("주소 : " + userAddr);
		System.out.println("핸드폰번호 : " + userPhone);
		System.out.println("날짜 : " + now);
		
		
		
		System.out.println(mem1.toString());
		MemberDTO mem2 = new MemberDTO();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		mem2.setUserId(scn.next());
		
		System.out.println("비밀번호를 입력하세요.");
		mem2.setuserPw(scn.next());
		
		System.out.println("이름을 입력하세요.");
		mem2.setUserName(scn.next());
		
		System.out.println("나이를 입력하세요.");
		mem2.setUserAge(scn.nextInt());
		
		System.out.println("주소를 입력하세요.");
		mem2.setUserAddr(scn.next());
		
		System.out.println("핸드폰 번호를 입력하세요.");
		mem2.setUserPhone(scn.next());
		
		mem2.setDay(new Date()); //현재 시간
		String day2 = sDay.format(new Date());
		
		
		System.out.println("아이디 : " + mem2.getUserId());
		System.out.println("비밀번호 : " + mem2.getUserPw());
		System.out.println("이름 : " + mem2.getUserName());
		System.out.println("나이 : " + mem2.getUserAge());
		System.out.println("주소 : " + mem2.getUserAddr());
		System.out.println("핸드폰 번호 : " + mem2.getUserPhone());
		System.out.println("현재 시간 : " + day2);
		
		scn.close();
	}
}
