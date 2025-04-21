package org.generation.employee.model;

public class Manager extends Employee {
	//Atributo único para Manager
	private Double bonus;
	
	//Constructor con atributos del super constructor, pero sin agregar el atributo
	//String position. En su lugar defino position como valor estático dentro de super();
	public Manager(Long id, String firstName, String lastName, Integer age, 
			Double salary, Double bonus) {
		super(id, firstName, lastName, age, "Manager", salary);
		this.bonus = bonus;		
	}
	
	//Getters y Setters
	public Double getBonus() { 
		return bonus;
	}
	
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	//toString()
	// toString
		@Override
		public String toString() {
			return "{id:" + getId() + ", firstName:" + getFirstName() + 
					", lastName:" + getLastName() + ", age:" + getAge() + 
					", position:" + getPosition() + ", salary:" + getSalary() + 
					", bonus:" + bonus + "}";
		}
		
	//Crear un método para calcularSalario. Aplicando polimorfismo mediante anulación
	//de métodos
		//Con la anotación @Override le estoy diciendo que el método se está
		//sobreescribiendo
		@Override
		public Double calcularSalario() {
			return this.getSalary() + this.getBonus();
		}

}//Manager
