package com.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.Notice_FaqDao;
import com.spring.board.model.Notice_Faq;

@Service
public class Notice_FaqServiceImpl implements Notice_FaqService {

	@Autowired
	private Notice_FaqDao fDao;

	@Override
	public List<Notice_Faq> Notice_Faq_List(Notice_Faq notice_Faq) {
		return fDao.Notice_Faq_List();
	}

	@Override
	public int Notice_Faq_Write(Notice_Faq notice_faq) {

		return fDao.Notice_Faq_Write(notice_faq);
	}

	@Override
	public int Notice_Faq_Modify(Notice_Faq notice_faq) {

		return fDao.Notice_Faq_Modify(notice_faq);
	}

	@Override
	public Notice_Faq Notice_Faq_Content(int num) {

		return fDao.Notice_Faq_Content(num);
	}

	@Override
	public int Notice_Faq_Delete(int num) {
		return fDao.Notice_Faq_Delete(num);
	}

	@Override
	public List<Notice_Faq> Faq_list(Notice_Faq notice_Faq) {
		return fDao.Faq_List();
		
	}

	@Override
	public int Faq_Write(Notice_Faq notice_faq) {
		return fDao.Faq_Write(notice_faq);
	}

	@Override
	public List<Notice_Faq> Notice_Faq_serch(Notice_Faq notice_faq) {
		
		return fDao.Notice_Faq_serch(notice_faq);
			
				
	}

}
