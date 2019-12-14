package com.spring.board.model;

public class Member {
	private int num;
	private String acnt_id;
	private String acnt_pw;
	private String business_reg;
	private String document;
	private String bank;
	private String bank_number;
	private String upload_cnt;
	private String name;
	private String acnt_type;
	private String acnt_status;
	private String date;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAcnt_id() {
		return acnt_id;
	}

	public void setAcnt_id(String acnt_id) {
		this.acnt_id = acnt_id;
	}

	public String getAcnt_pw() {
		return acnt_pw;
	}

	public void setAcnt_pw(String acnt_pw) {
		this.acnt_pw = acnt_pw;
	}

	public String getBusiness_reg() {
		return business_reg;
	}

	public void setBusiness_reg(String business_reg) {
		this.business_reg = business_reg;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBank_number() {
		return bank_number;
	}

	public void setBank_number(String bank_number) {
		this.bank_number = bank_number;
	}

	public String getUpload_cnt() {
		return upload_cnt;
	}

	public void setUpload_cnt(String upload_cnt) {
		this.upload_cnt = upload_cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcnt_type() {
		return acnt_type;
	}

	public void setAcnt_type(String acnt_type) {
		this.acnt_type = acnt_type;
	}

	public String getAcnt_status() {
		return acnt_status;
	}

	public void setAcnt_status(String acnt_status) {
		this.acnt_status = acnt_status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", acnt_id=" + acnt_id + ", acnt_pw=" + acnt_pw + ", business_reg=" + business_reg
				+ ", document=" + document + ", bank=" + bank + ", bank_number=" + bank_number + ", upload_cnt="
				+ upload_cnt + ", name=" + name + ", acnt_type=" + acnt_type + ", acnt_status=" + acnt_status
				+ ", date=" + date + "]";
	}
}