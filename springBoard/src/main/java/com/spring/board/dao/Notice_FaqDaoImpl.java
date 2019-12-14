package com.spring.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.model.Notice_Faq;

@Repository
public class Notice_FaqDaoImpl implements Notice_FaqDao {

	@Autowired
	private SqlSession sessionTemplate;

	@Override
	public List<Notice_Faq> Notice_Faq_List() {

		return sessionTemplate.selectList("Notice_Faq_list");
	}

	@Override
	public int Notice_Faq_Write(Notice_Faq notice_faq) {
		return sessionTemplate.insert("Notice_Faq_Write", notice_faq);
	}

	@Override
	public int Notice_Faq_Modify(Notice_Faq notice_faq) {
		System.out.println("dao.in");
		System.out.println(notice_faq.getNum());
		int result = sessionTemplate.update("notice_faq_Modift", notice_faq);
		return result;
	}

	@Override
	public int Notice_Faq_Delete(int num) {

		return sessionTemplate.delete("Notice_Faq_Delete", num);
	}

	@Override
	public Notice_Faq Notice_Faq_Content(int num) {

		return sessionTemplate.selectOne("Notice_Faq_Content", num);
	}

	@Override
	public List<Notice_Faq> Faq_List() {
		return sessionTemplate.selectList("Faq_list");

	}

	@Override
	public int Faq_Write(Notice_Faq notice_faq) {
		return sessionTemplate.insert("Faq_Write", notice_faq);
	}

	@Override
	public List<Notice_Faq> Notice_Faq_serch(Notice_Faq notice_faq) {

		return sessionTemplate.selectList("Notice_Faq_serch", notice_faq);
	}

}
