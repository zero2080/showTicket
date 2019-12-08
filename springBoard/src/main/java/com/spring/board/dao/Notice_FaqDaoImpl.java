package com.spring.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.model.Notice_Faq;

@Repository
public class Notice_FaqDaoImpl implements Notice_FaqDao{

	@Autowired
	private SqlSession sessionTemplate;
	
	@Override
	public List<Notice_Faq> Notice_Faq_List() {
		
		return sessionTemplate.selectList("Notice_Faq_list");
	}

	
}
