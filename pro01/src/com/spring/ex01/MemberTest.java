package com.spring.ex01;

public class MemberTest {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO(); // 관계를 개발자가 코드로 규정
		
		vo.setName("이름");
		vo.setAge(1);
		vo.setAddr("주소");
		
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getAddr());
	}
}
