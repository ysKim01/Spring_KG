package com.spring.ex04;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDAO {
	public static SqlSessionFactory sqlMapper=null;
	
	private static SqlSessionFactory getInstance() {
		if(sqlMapper==null) {
			try {
				String resource = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}
	public List<MemberVO> selectAllMemberList(){
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> memList = null;
		memList = session.selectList("mapper.member.selectAllMemberList");

		return memList;
	}
	public MemberVO selectMemberById(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		MemberVO vo = session.selectOne("mapper.member.selectMemberById", id);

		return vo;
	}
	public List<MemberVO> selectMemberByPw(int pw) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List<MemberVO> memList = null;
		memList = session.selectList("mapper.member.selectMemberList", pw);

		return memList;
	}
	public int insertMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result = session.insert("mapper.member.insertMember", memberVO);
		session.commit(); // 자동저장
		
		System.out.println(result);
		return result;
	}
	public int updateMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result = session.update("mapper.member.updateMember", memberVO);
		session.commit(); // 자동저장
		
		System.out.println(result); // 아이디를 못찾으면 0을 반환, 수정이 성공하면 1을 반환
		return result;
	}
	public void deleteMember(String id) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = 0;
		result = session.delete("mapper.member.deleteMember", id);
		session.commit(); // 자동저장
		System.out.println(result); // 아이디를 못찾으면 0을 반환, 삭제 성공 시 1반환
	}
	
	public List searchMember(MemberVO memberVO) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List list = session.selectList("mapper.member.searchMember2", memberVO);
		return list;		
	}
	
	public List foreachSelect(List nameList) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		List list = session.selectList("mapper.member.foreachSelect", nameList);
		return list;	
	}
	public int foreachInsert(List memList) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		int result = session.insert("mapper.member.foreachInsert", memList);
		session.commit();
		return result;	
	}
	
}








