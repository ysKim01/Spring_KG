package com.spring.ex04;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO dao) {
		this.memberDAO = dao;
	}
	@Override
	public void listMembers() {
		memberDAO.listMembers();
	}
}
