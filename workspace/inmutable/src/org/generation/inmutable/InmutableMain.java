package org.generation.inmutable;

public class InmutableMain {
	
	public static void main(String[] args) {
		Inmutable inmutable = new Inmutable("Daniel");
		System.out.println(inmutable.getName());//OP: Daniel
		
		//Modificar el name del objeto inmutable
		//inmutable.setName("Dano");
		//System.out.println(inmutable.getName());//OP: Dano
	}//main

}//class InmutableMain
