package com.bismi.lc.api;

public class DtoClass {

	private String userName;
	private String crushName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "DtoClass [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
}
