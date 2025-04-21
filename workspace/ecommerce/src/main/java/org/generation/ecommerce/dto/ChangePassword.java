package org.generation.ecommerce.dto; // dto → Data Transfer Object

public class ChangePassword { // Esta clase es la estructura que se va a utilizar para hacer el Update
	private String password;
	private String npassword;	
	
	// Constructores
	
	public ChangePassword() {}
	
	
	public ChangePassword(String password, String npassword) {
		this.password = password;
		this.npassword = npassword;
	}
	
	// Getters and Setters

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNpassword() {
		return npassword;
	}


	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}
	
	// toString()

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}	

} // class ChangePassword


