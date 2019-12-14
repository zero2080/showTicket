package com.spring.board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.board.model.Advertising;
import com.spring.board.model.Member;

public interface MemberService {
	public List<Member> memberList();
	public Member getMember(String acnt_id);
	public boolean joinCom(MultipartHttpServletRequest mRequest, Member member);
}
