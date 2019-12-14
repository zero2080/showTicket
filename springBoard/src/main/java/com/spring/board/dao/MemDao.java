package com.spring.board.dao;

import java.util.List;

import com.spring.board.model.Advertising;
import com.spring.board.model.Member;

public interface MemDao {
	public List<Member> memberList();
	public Member getMember(String acnt_id);
	public boolean joinCom(Member member);
	public boolean idExist(String acnt_id);
	public boolean uploadShow(Advertising advert);
}
