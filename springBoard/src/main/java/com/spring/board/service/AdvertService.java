package com.spring.board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.spring.board.model.Advertising;

public interface AdvertService {
	public boolean uploadShow(MultipartHttpServletRequest mRequest,Advertising advert);
	public List<Advertising> myShowList(String acnt_id);
	
}
