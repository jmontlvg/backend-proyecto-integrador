package org.generation.inmutable;

//Esta clase intenta heredar de la super Inmutable, pero como la super clase está marcada
//como final no puede heredar
public class SubInmutable extends Inmutable {
	
	//Podemos indicar las variables comi tipo final
	private final String role;
	
	//Constructor que recibe super constructor
	public SubInmutable(String name, String role) {
		super(name);
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

}//class SubInmutable
