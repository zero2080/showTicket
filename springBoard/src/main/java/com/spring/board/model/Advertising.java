package com.spring.board.model;

public class Advertising {
	private int num;
	private int category1;
	private int category2;
	private String acnt_id;
	private String name;
	private String company;
	private String ticket_name;
	private int show_mini;
	private int ticket_price;
	private int show_time;
	private String address;
	private String detail_img;
	private String sub_img;
	private String main_img;
	private int day_ticket;
	private String show_start_time;
	private String create_date;
	private int type;
	private String open_date;
	private String del_date;
	private String document;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCategory1() {
		return category1;
	}
	public void setCategory1(int category1) {
		this.category1 = category1;
	}
	public int getCategory2() {
		return category2;
	}
	public void setCategory2(int category2) {
		this.category2 = category2;
	}
	public String getAcnt_id() {
		return acnt_id;
	}
	public void setAcnt_id(String acnt_id) {
		this.acnt_id = acnt_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTicket_name() {
		return ticket_name;
	}
	public void setTicket_name(String ticket_name) {
		this.ticket_name = ticket_name;
	}
	public int getShow_mini() {
		return show_mini;
	}
	public void setShow_mini(int show_mini) {
		this.show_mini = show_mini;
	}
	public int getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}
	public int getShow_time() {
		return show_time;
	}
	public void setShow_time(int show_time) {
		this.show_time = show_time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDetail_img() {
		return detail_img;
	}
	public void setDetail_img(String detail_img) {
		this.detail_img = detail_img;
	}
	public String getSub_img() {
		return sub_img;
	}
	public void setSub_img(String sub_img) {
		this.sub_img = sub_img;
	}
	public String getMain_img() {
		return main_img;
	}
	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}
	public int getDay_ticket() {
		return day_ticket;
	}
	public void setDay_ticket(int day_ticket) {
		this.day_ticket = day_ticket;
	}
	public String getShow_start_time() {
		return show_start_time;
	}
	public void setShow_start_time(String show_start_time) {
		this.show_start_time = show_start_time;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getOpen_date() {
		return open_date;
	}
	public void setOpen_date(String open_date) {
		this.open_date = open_date;
	}
	public String getDel_date() {
		return del_date;
	}
	public void setDel_date(String del_date) {
		this.del_date = del_date;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	@Override
	public String toString() {
		return "Advertising [num=" + num + ", category1=" + category1 + ", category2=" + category2 + ", acnt_id="
				+ acnt_id + ", name=" + name + ", company=" + company + ", ticket_name=" + ticket_name + ", show_mini="
				+ show_mini + ", ticket_price=" + ticket_price + ", show_time=" + show_time + ", address=" + address
				+ ", detail_img=" + detail_img + ", sub_img=" + sub_img + ", main_img=" + main_img + ", day_ticket="
				+ day_ticket + ", show_start_time=" + show_start_time + ", create_date=" + create_date + ", type="
				+ type + ", open_date=" + open_date + ", del_date=" + del_date + ", document=" + document + "]";
	}
}