package com.spring.ex01;

public class MemberTest {
	public static void main(String[] args) {
		MemberVO vo = new MemberVO(); // ���踦 �����ڰ� �ڵ�� ����
		
		vo.setName("�̸�");
		vo.setAge(1);
		vo.setAddr("�ּ�");
		
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getAddr());
	}
}
