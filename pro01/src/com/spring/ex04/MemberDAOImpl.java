package com.spring.ex04;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public void listMembers() {
		System.out.println("listMembers 메서드 호출");
		System.out.println("회원정보를 조회 합니다.");	
	}
	
}
