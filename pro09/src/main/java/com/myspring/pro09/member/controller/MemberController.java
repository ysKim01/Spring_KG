package com.myspring.pro09.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.pro09.member.vo.MemberVO;

public interface MemberController {
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView addMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView login(MemberVO member, RedirectAttributes rAttr,HttpServletRequest request, HttpServletResponse response) throws Exception;
} 
