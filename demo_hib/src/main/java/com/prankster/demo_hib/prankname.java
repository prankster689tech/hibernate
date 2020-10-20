package com.prankster.demo_hib;

import javax.persistence.Embeddable;

@Embeddable
public class prankname 
{
	private String pfname;
	private String pmname;
	private String plname;
	public String getPfname() {
		return pfname;
	}
	public void setPfname(String pfname) {
		this.pfname = pfname;
	}
	public String getPmname() {
		return pmname;
	}
	public void setPmname(String pmname) {
		this.pmname = pmname;
	}
	public String getPlname() {
		return plname;
	}
	public void setPlname(String plname) {
		this.plname = plname;
	}
	
	@Override
	public String toString() {
		return "prankname [pfname=" + pfname + ", pmname=" + pmname + ", plname=" + plname + "]";
	}
	
	

}
