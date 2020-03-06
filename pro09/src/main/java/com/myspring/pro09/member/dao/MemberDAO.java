package com.myspring.pro09.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro09.member.vo.MemberVO;


public interface MemberDAO {
	public List selectAllMembers() throws DataAccessException;
	public int insertMember(MemberVO memberVO) throws DataAccessException;
	public int deleteMember(String id) throws DataAccessException;
	public MemberVO loginById(MemberVO member);
}
