package com.learning.model;

public class UserModel 
{
	String usrNm;
	String usrPss;
	String usrEmail;
	String usrCont;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(String usrNm, String usrPss, String usrEmail, String usrCont) {
		super();
		this.usrNm = usrNm;
		this.usrPss = usrPss;
		this.usrEmail = usrEmail;
		this.usrCont = usrCont;
	}

	public String getUsrNm() {
		return usrNm;
	}
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	public String getUsrPss() {
		return usrPss;
	}
	public void setUsrPss(String usrPss) {
		this.usrPss = usrPss;
	}
	public String getUsrEmail() {
		return usrEmail;
	}
	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
	}
	public String getUsrCont() {
		return usrCont;
	}
	public void setUsrCont(String usrCont) {
		this.usrCont = usrCont;
	}
	@Override
	public String toString() {
		return "UserModel [usrNm=" + usrNm + ", usrPss=" + usrPss + ", usrEmail=" + usrEmail + ", usrCont=" + usrCont
				+ "]";
	}
	
	
}
