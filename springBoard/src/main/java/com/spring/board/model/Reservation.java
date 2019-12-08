package com.spring.board.model;

import java.util.Date;

public class Reservation {

	private int num; /* NOT NULL, */
	private String manager_id; /* NOT NULL COMMENT '등록한 관리자계정', */
	private String title;/* NOT NULL COMMENT '타이틀명', */
	private String name; /* NOT NULL COMMENT '예약자 이름', */
	private String group_name; /* NOT NULL COMMENT '단체명', */
	private int cnt; /* NOT NULL COMMENT '인원', */
	private String phone; /* NOT NULL COMMENT '연락처', */
	private Date resv_date; /* NOT NULL COMMENT '예약날짜', */
	private Date create_date; /* NOT NULL COMMENT '등록날짜', */
	private int type; /* NOT NULL COMMENT '0:최종관리자 외 수정불가/1:수정가능' */

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getResv_date() {
		return resv_date;
	}

	public void setResv_date(Date resv_date) {
		this.resv_date = resv_date;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
