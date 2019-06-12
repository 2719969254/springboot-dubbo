package com.jd.springboot.entity;

import java.io.Serializable;

/**
 * @author tianzuo
 */
public class CompanyEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String address;
	private String tel;

	private String pid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
}
