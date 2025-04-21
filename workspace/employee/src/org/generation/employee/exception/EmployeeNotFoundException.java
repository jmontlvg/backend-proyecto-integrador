package org.generation.employee.exception;

/*
 * En esta clase vamos a definir la Exception que se lance cuando un Employee no se
 * encuentra en la lista. No la vamos a manejar con un bloque try-catch, por lo tanto,
 * será una excepción 'No verificada' (unchecked).
 * Va a heredar de la clase RuntimeException.
 */

public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	/*
	 * Crear un constructor que me permita mostrarle al usuario un mensaje cuando se
	 * lance la Exception.
	 */
	public EmployeeNotFoundException(String mensaje) {
		super(mensaje);
	}	

}//EmployeeNotFoundException
