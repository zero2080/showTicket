package com.spring.board.dao;

import java.util.List;

import com.spring.board.model.Advertising;

public interface AdvertDao {
	public boolean uploadShow(Advertising advert);
	public List<Advertising> showList();
}
