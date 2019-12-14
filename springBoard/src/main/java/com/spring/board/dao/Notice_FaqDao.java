package com.spring.board.dao;

import java.util.List;

import com.spring.board.model.Notice_Faq;

public interface Notice_FaqDao {
	public List<Notice_Faq> Notice_Faq_List();
	public int Notice_Faq_Write(Notice_Faq notice_faq);
	public int Notice_Faq_Modify(Notice_Faq notice_faq);
	public int Notice_Faq_Delete(int num);
	public Notice_Faq Notice_Faq_Content(int num);
	
	
	public List<Notice_Faq> Notice_Faq_serch(Notice_Faq notice_faq);
	/* FAQ관련 */
	public List<Notice_Faq> Faq_List();
	public int Faq_Write(Notice_Faq notice_faq);

}
