package org.generation.employee.model;

//La interface me permite exponer métodos e implementarlos en superclases y subclases.
//Para implementar los métodos de una interface debemos indicar en las clases donde se
//implementan qué es un método que se sobreescribe @Override
//Para implementar esta Interface debo utilizar la palabra reservada 'implements', 
//dentro de las clases que tengan el método que comparte 
public interface Trabajador {
	//Abstracción: este método queda expuesto y a partir de la Interface se puede a él.
	//Los métodos abstractos no reciben un cuerpo
	public Double calcularSalario();

}//public interface Trabajador
