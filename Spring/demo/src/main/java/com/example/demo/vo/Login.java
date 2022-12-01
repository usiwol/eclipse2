package com.example.demo.vo;

// VO 클래스 : VO는 Value Object 줄임말
// VO클래스에는 필드변수와 getter, setter만 온다.
public class Login {
	private String uid;
	private String pw;
	private String email_id;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
}
