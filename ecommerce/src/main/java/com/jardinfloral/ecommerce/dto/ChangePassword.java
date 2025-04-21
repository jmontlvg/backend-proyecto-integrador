package com.jardinfloral.ecommerce.dto;

public class ChangePassword {

	private String password;
	private String npassword;
	
	public ChangePassword(String password, String npassword) {
		this.password = password;
		this.npassword = npassword;
	}//constructor
	public ChangePassword() {
		
	}//constructor vacío
	
	public String getPassword() {
		return password;
	}//get password
	public void setPassword(String password) {
		this.password = password;
	}//set password
	public String getNpassword() {
		return npassword;
	}//getNpassword
	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}//set Npassword
	
	
	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}
	
}
