package org.generation.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//En clase podemos escribir los métodos de prueba con las anotaciones correspondientes
//Probaremos métodos básicos de una calculadora que reciba dos parámetros de tipo 'double'
//Usaremos el enfoque TDD

public class CalculadoraTest {
	
	//Instancia del objeto a evaluar
	Calculadora calculadora = new Calculadora();
	
	//Método de prueba para sumar
	@Test
	@DisplayName("Sumando dos flotantes")
	public void sumar() {
		//assertEquals(resultado, método a evaluar(parámetros a evaluar))
		assertEquals(20, calculadora.sumar(10.0d, 10.0d));
	}// sumar
	
	//Método de prueba para multiplicar
	@Test
	@DisplayName("Multiplicando dos flotantes")
	public void multiplicar() {
		assertEquals(200, calculadora.multiplicar(20d, 10d));
	}//multiplicar
	
	//Método de prueba para dividir
	@Test
	@DisplayName("Dividiendo dos flotantes")
	public void dividir() {
		assertEquals(2, calculadora.dividir(20d, 10d));
	}//dividir
	
	/*
	//Método de prueba para dividir
	@Test
	@DisplayName("Dividiendo dos flotantes")
	public void dividirEntreCero() {
		assertEquals(Double.POSITIVE_INFINITY, calculadora.dividir(10d, 0d));
	}//dividirEntreCero
	*/
	
	//Método de prueba para lanzar una Exception al dividir entre 0, modificando para lanzar la Exception
	@Test
	@DisplayName("Lanzar Exception al dividir entre 0")
	public void dividirEntreCeroConException() {
		assertThrows(ArithmeticException.class, () -> calculadora.dividir(10d, 0d),
				"No se puede dividir entre 0");
	}//dividirEntreCeroConException
	
}//class CalculadoraTest
