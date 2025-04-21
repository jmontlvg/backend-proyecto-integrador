package org.generation.employee;

/* 
 * Esta clase es la plantilla que me permite definir los atributos y
 * comportamientos de un Object. Los atributos se definen como variables
 * de instancia y los comportamientos como métodos con lógica específica.
 */

public class Employee {
	
	//1. Definir atributos (variables de instancia)
	String firstName;
	String lastName;
	int age;
	double salary;
	String position;
	
	/*
	 * 2. Método constructor: tiene que recibir el nombre de la clase, no
	 * retorna algo, recibe los parámetros definidos para un objeto y
	 * dichos parámetros forman parte del constructor siendo almacenados
	 * en variables de tipo "this". 
	 * 
	 * "this", palabra clave que me permite hacer referencia al objeto actual de la clase,
	 * es decir, a la instancia de la clase o no propiamente el atributo como parámetro.
	 */
	
	/*Podemos generar un constructor de manera automática:
	 * Click derecho > Source > Generate constructor using fields > Select All > Generate 
	 */
	public Employee(String firstName, String lastName, int age, double salary, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.position = position;
	}
	
	/*
	 * Mediante sobrecarga de métodos (Overloading) podemos definir constructores
	 * adicionales según lo necesario.
	 */
	public Employee(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;		
	}
	
	//Método constructor vacío
	/*public Employee() {
		
	}*/
	
	/*
	 * 3. Los métodos de acceso y modificación (Getter y Setter) permiten que otras clases
	 * accedan o modifiquen la información de los objetos.
	 * 
	 * Getter → retornan el atributo (variable de instancia), son del mismo tipo de dato
	 * del atributo y no reciben parámetros. El nombre del método inicia con la palabra
	 * 'get'.
	 * 
	 * Setter → de tipo void (no retornan algo), reciben como argumento el atributo
	 * (variable de instancia) y el cuerpo del método se asigna a una variable de tipo 
	 * 'this'. El nombre del método inicia con la palabra 'set'.
	 */
	public String getFirstName() { //Este es el primer 'getter'
		return firstName;
	}
	
	public void setFirstName(String firstName) { //Este es el primer 'setter'
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	/*
	 * 4. Métodos de comportamiento	 * 
	 */
	
	//Método para obtener el nombre completo de un Employee
	public String getFullName() { 
		return firstName + " " + lastName;
	}
	//Método para conocer cuántos años le restan a un Employee para su jubilación (65 años)
	public int getYearsForRetirement() {
		return 65 - age;
	}
	//Método para conocer el salario de un Employee y su nombre completo
	public String getSalaryAndName() {
		return "Employee: " + getFullName() + " → Salary: " + salary;
	}
	
	//Método para calcular un incremento salarial con base en un porcentaje
	public double increaseSalary(double percentage) {
		return salary += salary * (percentage / 100);
	}
	
	//Método para conocer la posición de un Employee (nombre completo y posición)
	public String getPositionEmployee() {
		return "Employee: " + getFullName() + " → Position: " + position;
	}
	
	//5. Método toString();
	/*
	 * El método 'toString();' me permite mostrar los datos de los objetos en forma
	 * de String. Recibe el nombre toString y es de tipo String, por lo tanto retorna
	 * lo que deseamos mostrar.
	 * 
	 * Necesitamos agregar la anotación Override como buena práctica para indicar que
	 * estamos declarando un método de un supertipo.
	 */
	@Override
	public String toString() {
		return "Employee → firstName: " + firstName + ", lastName: " + lastName + ", age: " + age + ", salary: $" + salary + ", position:" + position;
	}
	
	
	
}//Employee
