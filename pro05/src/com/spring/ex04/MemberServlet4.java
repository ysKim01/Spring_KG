package com.spring.ex04;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mem4.do")
public class MemberServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MemberDAO dao = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		
		String action = request.getParameter("action");
		String nextPage = "";
		
		if(action==null || action.equals("listMembers")) {
			List<MemberVO> membersList = dao.selectAllMemberList();
			request.setAttribute("membersList", membersList);
			nextPage = "test02/listMembers.jsp";
		}
		else if(action.equals("selectMemberById")) {
			String id = request.getParameter("value");
			System.out.println(id);
			memberVO = dao.selectMemberById(id);
			request.setAttribute("member", memberVO);
			nextPage = "test02/memberInfo.jsp";
		}
		else if(action.equals("selectMemberByPw")) {
			int pw = Integer.parseInt(request.getParameter("value"));
			List<MemberVO> membersList = dao.selectMemberByPw(pw);
			request.setAttribute("membersList", membersList);
			nextPage = "test02/listMembers.jsp";
		}
		else if(action.equals("insertMember")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			memberVO.setId(id);
			memberVO.setPw(pw);
			memberVO.setName(name);
			memberVO.setEmail(email);
			
			dao.insertMember(memberVO);
			nextPage = "mem4.do?action=listMembers";
		}
		else if(action.equals("modForm")) {
			String id = request.getParameter("id");
			
			memberVO = dao.selectMemberById(id);
			request.setAttribute("member", memberVO);
			nextPage = "test02/modMember.jsp";
		}
		else if(action.equals("updateMember")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			memberVO.setId(id);
			memberVO.setPw(pw);
			memberVO.setName(name);
			memberVO.setEmail(email);
			
			dao.updateMember(memberVO);
			nextPage = "mem4.do?action=listMembers";
		}
		else if(action.equals("deleteMember")) {
			String id = request.getParameter("id");
			System.out.println(id);
			dao.deleteMember(id);
			nextPage = "mem4.do?action=listMembers";
		}
		else if (action.equals("searchMember")) {
			String name= request.getParameter("name");
			String email = request.getParameter("email");
			
			memberVO.setName(name);
			memberVO.setEmail(email);
			
			List membersList = dao.searchMember(memberVO);
			request.setAttribute("membersList", membersList);
			nextPage="test02/listMembers.jsp";
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}

}
