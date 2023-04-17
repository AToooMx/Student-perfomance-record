package com.spr.api;

public class Loggs {
	private String info;
	private String date;

	public Loggs() {
	}

	public Loggs(String info, String date) {
		this.info = info;
		this.date = date;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
