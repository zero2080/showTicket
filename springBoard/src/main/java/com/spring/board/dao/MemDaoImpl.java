package com.spring.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.model.Advertising;
import com.spring.board.model.Member;

@Repository
public class MemDaoImpl implements MemDao{

	@Autowired
	private SqlSession sessionTemplate;
	
	@Override
	public List<Member> memberList() {
		
		return sessionTemplate.selectList("memberList");
	}

	@Override
	public Member getMember(String acnt_id) {
		return sessionTemplate.selectOne("getMember",acnt_id);
	}
	
	@Override
	public boolean joinCom(Member member) {
		int result = sessionTemplate.insert("joinCom",member);
		return result==1?true:false;
	}
	@Override
	public boolean idExist(String acnt_id) {
		int result = sessionTemplate.selectOne("idExist",acnt_id);
		return result>0?true:false;
	}
	
	@Override
	public boolean uploadShow(Advertising advert) {
		int result = sessionTemplate.insert("uploadShow",advert);
		return result==1?true:false;
	}
}
