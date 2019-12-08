package com.spring.board.model;

import java.util.Date;

public class RegDate {

	private int num; /* NOT NULL */
	private String manager_id; /* NOT NULL, */
	private int acnt_type; /* NOT NULL COMMENT '0:관리자/1:업체', */
	private String reg_title; /* NOT NULL COMMENT '수정 타이틀', */
	private Date reg_date; /* NOT NULL COMMENT '수정날짜' */

	@Override
	public String toString() {
		return "RegDate :[ num=" + num + ", manager_id=" + manager_id + ", acnt_type=" + acnt_type + ",reg_title ="
				+ reg_title + ", reg_date=" + reg_date + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public int getAcnt_type() {
		return acnt_type;
	}

	public void setAcnt_type(int acnt_type) {
		this.acnt_type = acnt_type;
	}

	public String getReg_title() {
		return reg_title;
	}

	public void setReg_title(String reg_title) {
		this.reg_title = reg_title;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

}
