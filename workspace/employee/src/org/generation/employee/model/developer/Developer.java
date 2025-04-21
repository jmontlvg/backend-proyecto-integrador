package org.generation.employee.model.developer;

import org.generation.employee.model.Employee;

public class Developer {
	private Programming Language language;
	
	
	
	
	//Getters y Setters
	public ProgrammingLanguage getLanguage() {
		return language;
	}
	
	public void setLanguage(ProgrammingLanguage language) {
		this.Language = language;
	}
	
	
	//toString();
	@Override
	public String toString() {
		return "{id:" + getId() + ", firstName:" + getFirstName() + ", lastName:" + getLastName() + ", age:" + getAge() + ", position:" + getPosition() + ", salary:" + getSalary() + ", language:" + language + "}";
	}
	
	

}
