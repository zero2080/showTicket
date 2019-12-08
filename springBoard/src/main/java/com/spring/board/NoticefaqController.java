package com.spring.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.board.model.Member;
import com.spring.board.model.Notice_Faq;
import com.spring.board.service.MemberService;
import com.spring.board.service.Notice_FaqService;

@Controller
@RequestMapping("Notice_Faq")
public class NoticefaqController {
	
	@Autowired
	private Notice_FaqService service;
	
	@ModelAttribute("Notice_Faq_List")
	public List<Notice_Faq> Notice_Faq_List(){
		return service.Notice_Faq_List();
	}
	
	@RequestMapping(value = "Notice_Faq_List")
	public String Notice_Faq_List(Model model) {
		System.out.println("In Notice_Faq_List");
		model.addAttribute("NF_list", service.Notice_Faq_List());
		return "notis_fnq/faq_list";
	}
	
	

	// TODO Login
	/*
	 * @RequestMapping(value = "loginPro") public String loginPro(String loginId,
	 * String loginPw, HttpSession session, Model model) {
	 * System.out.println(loginId + "/" + loginPw);
	 * 
	 * Member mem = service.getMember(loginId);
	 * 
	 * if (mem != null) { if (mem.getAcnt_pw().equals(loginPw)) { // login Success
	 * session.setAttribute("member", mem); return "main/main"; } else { return "";
	 * } } else { // not exist id
	 * 
	 * return ""; } }
	 */

}
