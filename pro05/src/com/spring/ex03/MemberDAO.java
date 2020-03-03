package com.spring.ex03;

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
	
	
}








