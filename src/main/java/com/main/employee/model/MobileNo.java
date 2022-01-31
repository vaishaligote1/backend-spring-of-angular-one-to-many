package com.main.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MobileNo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobid;
	private String mobileno;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "emp_id")
//	private Employee emp;
//	public Employee getEmp() {
//		return emp;
//	}
//	public void setEmp(Employee emp) {
//		this.emp = emp;
//	}
	public int getMobid() {
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	

}
