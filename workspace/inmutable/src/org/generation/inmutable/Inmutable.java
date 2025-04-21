package org.generation.inmutable;

//Las clases Inmutables no cambian su forma. Deben tener características específicas:
//1. Se deben marcar la clase como final
//2. No deben proveer métodos de modificación (Setter)
//3. Se deben encapsular los atributos
//Las clases final(inmutables) no pueden heredar a otras clases

public final class Inmutable {
	
	private String name;
	
	public Inmutable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	/*
	No debemos proveer setters
	public void setName(String name) {
		this.name = name;
	}
	*/

}//class Inmutable

