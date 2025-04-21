package org.generation.exceptions;

public class ExcepcionAritmetica {
	//Crear un método que permita dividir 2 enteros.
	//En esta misma clase vamos a probar el método para observar cómo funcionan las
	//exceptions.
	
	static int division(int num1, int num2) {
		return num1 / num2;
	}//division
	
	public static void main(String[] args) {
		System.out.println(division(50, 10));//OP: 5
		System.out.println(division(50, 9));//OP: 5
		/*
		 * System.out.println(division(32, 0));
		 */
		System.out.println(division(10, 5));//OP: 5
		
		//Manejando Exception con el bloque try-catch
		try {
			System.out.println("Dividiendo entre 0: " + division(32, 0));
		} catch (ArithmeticException e) {
			System.out.println("No podemos dividir entre cero (0)");
		} finally { //No siempre vamos a tener finally en un try-catch
			System.out.println("Bloque try-catch 01 finalizado");
		}
		
		try {
			System.out.println("Dividiendo: " + division(32, 8));
		} catch (ArithmeticException e) {
			System.out.println("No podemos dividir entre cero (0)");
		} finally { //No siempre vamos a tener finally en un try-catch
			System.out.println("Bloque try-catch 02 finalizado");
		}
		
	}//main

}//ExcepcionArimetica
