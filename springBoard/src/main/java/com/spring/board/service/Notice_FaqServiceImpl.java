package com.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.board.dao.Notice_FaqDao;
import com.spring.board.model.Notice_Faq;

@Service
public class Notice_FaqServiceImpl implements Notice_FaqService{
	@Autowired
	private Notice_FaqDao fDao;
	@Override
	public List<Notice_Faq> Notice_Faq_List(){
		return fDao.Notice_Faq_List();
	}
	
}
