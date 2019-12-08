package com.spring.board.model;


import java.util.Date;

public class Advertising {
	
	
	private int num;
	private int category;  	/*'0:공연/1:농원/2:랜드'*/
	private String acnt_id;
	private String name;	/* '실무자명',*/
	private String company;	 /*'회사명'*/ 
	private String ticket_name; /*'상품명'*/
	private int show_mini;	/* NOT NULL COMMENT '시작최소인원',*/
	private int ticket_price; /*NOT NULL COMMENT '가격',*/
	private int show_time; /* NOT NULL COMMENT '1회공연에 걸리는 시간',*/
	private String address;  /*NOT NULL COMMENT '공연장주소',*/
	private String address_img;/* NOT NULL COMMENT '공연장지도img'*/
	private String main_img_contents; /*NOT NULL COMMENT '이미지와 텍스트가 같이 들어가 있음( br이란 문자를 넣어 구분할 예정)',*/
	private String sub_img_contents; /* NOT NULL COMMENT '서브(리스트)화면',*/
	private int day_ticket;  /*NOT NULL COMMENT '일일 티켓 판매 가능수',*/
	private Date day_show_start_time; /* NOT NULL COMMENT '일일 공연 시작 시간 (해당 시간 예약 시 변경 불가)',*/
	private Date day_show_end_time; /* NOT NULL COMMENT '일일 공연 종료 시간 (해당 시간 예약 시 변경 불가)',*/
	private Date create_date; /* NOT NULL COMMENT '등록일',*/
	private int type;/* NOT NULL DEFAULT '1' COMMENT '0:승인/1:비승인',*/
	private Date open_date;/* NOT NULL COMMENT '판매시작일',*/
	private Date del_date;/* NOT NULL COMMENT '판매종료일'*/
	
	
	
	
	@Override
	public String toString() {
		return "Advertising [num=" + num + ", category=" + category + ", acnt_id=" + acnt_id + ", name=" + name
				+ ", company=" + company + ", ticket_name=" + ticket_name + ", show_mini=" + show_mini
				+ ", ticket_price=" + ticket_price + ", show_time=" + show_time + ", address=" + address
				+ ", address_img=" + address_img + ", main_img_contents=" + main_img_contents + ", sub_img_contents="
				+ sub_img_contents + ", day_ticket=" + day_ticket + ", day_show_start_time=" + day_show_start_time
				+ ", day_show_end_time=" + day_show_end_time + ", create_date=" + create_date + ", type=" + type
				+ ", open_date=" + open_date + ", del_date=" + del_date + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
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
	public String getAddress_img() {
		return address_img;
	}
	public void setAddress_img(String address_img) {
		this.address_img = address_img;
	}
	public String getMain_img_contents() {
		return main_img_contents;
	}
	public void setMain_img_contents(String main_img_contents) {
		this.main_img_contents = main_img_contents;
	}
	public String getSub_img_contents() {
		return sub_img_contents;
	}
	public void setSub_img_contents(String sub_img_contents) {
		this.sub_img_contents = sub_img_contents;
	}
	public int getDay_ticket() {
		return day_ticket;
	}
	public void setDay_ticket(int day_ticket) {
		this.day_ticket = day_ticket;
	}
	public Date getDay_show_start_time() {
		return day_show_start_time;
	}
	public void setDay_show_start_time(Date day_show_start_time) {
		this.day_show_start_time = day_show_start_time;
	}
	public Date getDay_show_end_time() {
		return day_show_end_time;
	}
	public void setDay_show_end_time(Date day_show_end_time) {
		this.day_show_end_time = day_show_end_time;
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
	public Date getOpen_date() {
		return open_date;
	}
	public void setOpen_date(Date open_date) {
		this.open_date = open_date;
	}
	public Date getDel_date() {
		return del_date;
	}
	public void setDel_date(Date del_date) {
		this.del_date = del_date;
	}
	

		
	

		

}
