package com.example.demo.vo;

//VO 클래스 : VO는 Value Object 줄임말
//VO 클래스에는 필드변수와 getter, setter만 온다.
public class Login{

	private String userId;
	private String userPassword;
	private String userEmail;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
