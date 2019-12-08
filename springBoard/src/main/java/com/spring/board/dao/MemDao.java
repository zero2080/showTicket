package com.spring.board.dao;

import java.util.List;

import com.spring.board.model.Member;

public interface MemDao {
	public List<Member> memberList();
	public Member getMember(String acnt_id);
	public boolean joinCom(Member member);
}
