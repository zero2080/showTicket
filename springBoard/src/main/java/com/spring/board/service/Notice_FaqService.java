package com.spring.board.service;

import java.util.List;

import com.spring.board.model.Notice_Faq;

public interface Notice_FaqService {
	public List<Notice_Faq> Notice_Faq_List(Notice_Faq notice_Faq);
	public int Notice_Faq_Write(Notice_Faq notice_faq);
	public int Notice_Faq_Modify(Notice_Faq notice_faq);
	public Notice_Faq Notice_Faq_Content(int num);
	public int Notice_Faq_Delete(int num);
	
	public List<Notice_Faq> Notice_Faq_serch(Notice_Faq notice_faq);
	
	
	public List<Notice_Faq> Faq_list(Notice_Faq notice_Faq);
	public int Faq_Write(Notice_Faq notice_faq);
}
