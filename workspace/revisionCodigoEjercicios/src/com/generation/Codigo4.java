//Se recrea el el juego de "piedra, papel o tijeras"
/**
 * Datos de entrada:
 * String 1
 * String 2
 * 
 */

package com.generation;

import java.util.Scanner;//Se importa la java.util.Scanner

public class Codigo4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Se agrega 'System.in'
	}
		
		
		
		
	
   
    
    
    String j1 = s.nextLine();
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Scanner s2 = new Scanner();
    String j2 = s.nextLine();
    
    if (j1 == j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
  
}//class Codigo4
