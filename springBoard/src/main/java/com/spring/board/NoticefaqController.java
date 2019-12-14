package com.spring.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.model.Notice_Faq;
import com.spring.board.service.Notice_FaqService;

@Controller
public class NoticefaqController {

	@Autowired
	private Notice_FaqService service;

	/* 공지사항 */
	@RequestMapping(value = "notice_list")
	public String Notice_Faq_List(Model model, Notice_Faq notice_faq) {
		System.out.println("공지사항 리스트 보여줄꺼야.");
		model.addAttribute("NF_list", service.Notice_Faq_List(notice_faq));
		return "notice_faq/notice_list";
	}

	@RequestMapping(value = "Notice_Faq_writeForm")
	public String writeForm() {
		return "notice_faq/notice_write";
	}

	@RequestMapping(value = "Notice_Faq_Write", method = RequestMethod.POST)
	public String Notice_Faq_Write(Model model, Notice_Faq notice_Faq) {
		System.out.println("노티스 글쓰기 들어옴 :) ");
		service.Notice_Faq_Write(notice_Faq);
		return "notice_faq/notice_list";
	}

	@RequestMapping(value = "Notice_Faq_Content")
	public String Notice_Faq_Content(Model model, int num) {
		System.out.println("상세 페이지 " + num);
		model.addAttribute("NF_con", service.Notice_Faq_Content(num));
		return "notice_faq/notice_detail";
	}

	@RequestMapping(value = "Notice_Faq_ModifyForm")
	public String modifyForm(int num, Model model) {
		model.addAttribute("NF_ModifyForm", service.Notice_Faq_Content(num));
		return "notice_faq/notice_modifyform";
	}

	/* FAQ 부분 */
	@RequestMapping(value = "faq_list")
	public String faq_list(Model model, Notice_Faq notice_faq) {
		System.out.println("FAQ 리스트 보여줄꺼야.");
		model.addAttribute("FAQ_list", service.Faq_list(notice_faq));
		return "notice_faq/faq_list";
	}
	@RequestMapping(value = "Faq_writeForm")
	public String Faq_writeForm() {
		return "notice_faq/faq_write";
	}

	@RequestMapping(value = "Faq_Write", method = RequestMethod.POST)
	public String Faq_Write(Model model, Notice_Faq notice_Faq) {
		System.out.println("FAQ 글쓰기 들어옴 :) ");
		service.Faq_Write(notice_Faq);
		return "notice_faq/faq_list";
	}

}
