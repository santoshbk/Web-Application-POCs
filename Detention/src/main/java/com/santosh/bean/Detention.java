package com.santosh.bean;

import java.util.List;

public class Detention {

	private String name;
	private String type;
	private String time;
	private List<String> list;

	public Detention() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public String getType() {
		return type;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
