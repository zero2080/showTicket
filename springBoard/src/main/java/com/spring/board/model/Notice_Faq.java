package com.spring.board.model;

import java.util.Date;

public class Notice_Faq {

	private int num; /* NOT NULL */
	private String title; /* NOT NULL, */
	private String contents; /* NOT NULL, */
	private int type;/* NOT NULL COMMENT '0:공지/1:faq', */
	private Date date;/* NOT NULL */

	@Override
	public String toString() {
		return "Notice_Faq [ num = " + num + ", titel=" + title + ", contents = " + contents + ", type=" + type
				+ ", Date" + date + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
