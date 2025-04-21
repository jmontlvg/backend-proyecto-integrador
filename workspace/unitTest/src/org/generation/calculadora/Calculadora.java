package org.generation.calculadora;

public class Calculadora {
	
	//Método para sumar dos 'double'
	public double sumar(double num1, double num2) {		
		return num1 + num2;
	}
	
	//Método para multiplicar dos 'double'
	public double multiplicar(double num1, double num2) {		
		return num1 * num2;
	}
	
	//Método para dividir dos 'double'
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}
	
	//Método para dividir dos 'double', modificando para lanzar la Exception
	public double dividir(double num1, double num2) {		
		if(num2 == 0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		}		
			return num1 / num2;
	}
	
}
