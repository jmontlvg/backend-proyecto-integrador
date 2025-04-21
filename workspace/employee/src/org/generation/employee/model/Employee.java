package org.generation.employee.model;

//Voy a implementar la interface Trabajador en esta clase, para ocultar el método
//calcularSalario() y exponerlo en la interface
public class Employee implements Trabajador {
	//Atributos
	private Long id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String position;
	private Double salary;
	
	public Employee(Long id, String firstName, String lastName, Integer age, String position, Double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "{id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", position=" + position + ", salary=" + salary + "}";
	}
	
	//Método para calcular el salario
	//Como este método se expone en Interface Trabajador, debo anotarlo con @Override
	
	@Override
	public Double calcularSalario() {
		return this.getSalary();
	}
	
}//Employee
