package org.cap.demo.login;

public class LoginFeacture {
	private String uName;
	private String pwd;
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "LoginFeacture [uName=" + uName + ", pwd=" + pwd + "]";
	}
	

}
