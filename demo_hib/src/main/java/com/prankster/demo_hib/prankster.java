package com.prankster.demo_hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="prankster1")
public class prankster 
{
	@Id//creates id as primary key
	private int pid;
	private prankname pname;
	private String prankster;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public prankname getPname() {
		return pname;
	}
	public void setPname(prankname pname) {
		this.pname = pname;
	}
	public String getPrankster() {
		return prankster;
	}
	public void setPrankster(String prankster) {
		this.prankster = prankster;
	}
	
	@Override
	public String toString() {
		return "prankster [pid=" + pid + ", pname=" + pname + ", prankster=" + prankster + "]";
	}
	
	
	
}