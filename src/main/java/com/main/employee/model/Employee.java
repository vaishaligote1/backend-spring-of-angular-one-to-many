package com.main.employee.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private String email;
	@OneToMany (cascade = CascadeType.ALL)
	private Set<MobileNo> mobno=new HashSet<MobileNo>();
	private String password;
	private String status="Active";
	public String getStatus() {
		return status;
	}
	public Set<MobileNo> getMobno() {
		return mobno;
	}

	public void setMobno(Set<MobileNo> mobno) {
		this.mobno = mobno;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
