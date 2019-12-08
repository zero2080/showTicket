package com.spring.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.board.model.Member;
import com.spring.board.service.MemberService;

@Controller
public class HomeController {
	
	HttpSession session = null;
	@Autowired
	private MemberService service;

	@ModelAttribute("memberList")
	public List<Member> memberList() {
		return service.memberList();
	}

	@RequestMapping(value = "home")
	public String home(Model model) {
		System.out.println("In homeController");
		model.addAttribute("member", service.memberList());
		return "home";
	}

	@RequestMapping(value = "main")
	public String main() {

		return "main/main";
	}

	@RequestMapping(value = "admin_insert")
	public String admin_insert() {
		System.out.println("admin_insert.고고");
		return "admin/admin_insert";
	}

	@RequestMapping(value="admin_join")
	public String admin_join(Member member, MultipartHttpServletRequest mRequest) {
		//공연사 등록
		session = mRequest.getSession();
		
		boolean joinResult = service.joinCom(mRequest, member);
		
		session.setAttribute("joinResult",joinResult);
		
		return "redirect:admin_insert.do";
	}
	
	@RequestMapping(value = "admin_modify")
	public String admin_modify() {
		System.out.println("admin_modify.고고");
		return "admin/admin_modify";
	}

	@RequestMapping(value = "show_insert")
	public String show_insert() {
		System.out.println("들어옴");
		return "admin/admin_modify";
	}

	@RequestMapping(value = "notice_list")
	public String notice_list() {
		System.out.println("notis_fnq 들어옴");
		return "notis_fnq/notice_list";
	}
	@RequestMapping(value = "faq_list")
	public String faq_list() {
		System.out.println("notis_fnq 들어옴");
		return "notis_fnq/faq_list";
	}

	@RequestMapping(value="goIndex")
	public String goIndex(HttpSession session) {
		session.invalidate();
		return "../../index";
	}

	// TODO Login
	@RequestMapping(value = "loginPro")
	public String loginPro(String loginId, String loginPw, HttpSession session, Model model) {
		
		//ID/PW 배포전에 삭제해야함
		System.out.println(loginId + "/" + loginPw);

		Member mem = service.getMember(loginId);

		if (mem != null) {
			if (mem.getAcnt_pw().equals(loginPw)) {
				// login Success
				
				if(mem.getAcnt_type().equals("0")) {
					//영업자메인
					session.setAttribute("member", mem);
					return "main/main";
				}else if(mem.getAcnt_type().equals("1")){
					
					System.out.println(mem.toString());
					//공연사메인
					session.setAttribute("member", mem);
					return "main/main";
				}else {
					//0,1외에 다른 값이 리턴 : 나중에 상태값에따라 추가가능
					return "redirect:goIndex.do";
				}
				
			} else {
				//exist id but login fail
				return "redirect:goIndex.do";
			}
		} else {
			// not exist id

			return "redirect:goIndex.do";
		}
	}

	@RequestMapping(value="uploadShowInfo")
	public String uploadShowInfo() {
		return "user/uploadShowInfo";
	}
	
	@RequestMapping(value="uploadShow")
	public String uploadShow(MultipartHttpServletRequest mRequest, Model model) {
		session = mRequest.getSession();
		String page = "../../index";
		
		
		return page;
	}
		
}
