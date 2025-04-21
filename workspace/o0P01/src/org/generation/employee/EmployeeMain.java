package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		/*
		 * Instanciar (crear) los objetos de tipo Employee. Estos objetos toman las
		 * propiedades específicas en el/los método(s) constructor(es).
		 */
		Employee lizbeth = new Employee("Lizbeth", "Delgado", 25, 32522.36d, "Scrum Master");
		Employee erick = new Employee("Erick", "Dominguez", 24, 25800.52d, "Backend Developer");
		Employee lenny = new Employee("Lenny", "Cocom", 29, 51366.12d, "Backend Developer");
		Employee sofy = new Employee("Sofia", "Garcia", 25, 54315.22d, "Data Analyst");
		Employee emmanuel = new Employee("Emmanuel", "Luna", 28, 35500d, "Frontend Developer");
		
		System.out.println(lizbeth);
		
		System.out.println(lizbeth.getFullName());
		System.out.println(erick.getYearsForRetirement());
		System.out.println(lenny.getSalaryAndName());
		System.out.println(sofy.increaseSalary(10));
		System.out.println(emmanuel.getPositionEmployee());

	}//main

}//EmployeeMain
