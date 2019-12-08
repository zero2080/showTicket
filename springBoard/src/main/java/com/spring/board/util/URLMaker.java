package com.spring.board.util;

public class URLMaker {
	
	public static String imgLinkMaker(StringBuffer url,String fileName) {
		//이미지 웹링크 반환
		int lastIndex = url.toString().lastIndexOf("/");
		return url.toString().substring(0,lastIndex)+"/img/"+fileName;
	}
}
