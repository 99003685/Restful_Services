package com.rest.springrest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private long u_id;
	private String u_name;
	private String u_desc;
	public User(long c_id, String c_name, String c_desc) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_desc = u_desc;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getU_id() {
		return u_id;
	}
	public void setU_id(long u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_desc() {
		return u_desc;
	}
	public void setU_desc(String u_desc) {
		this.u_desc = u_desc;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_desc=" + u_desc + "]";
	}
	
	
	
}
