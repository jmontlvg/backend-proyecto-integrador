package org.generation.employee.main;

import org.generation.employee.model.Employee;
import org.generation.employee.service.EmployeeService;

public class EmployeeMain {
	
	public static void main(String [] args) {
		//Instancia de EmployeeService que me permite acceder a todo lo que vive dentro de EmployeeService
		EmployeeService employeeService = new EmployeeService();
		
		System.out.println(employeeService.getEmpleados());
		
		//Agregando Employees al ArrayList
		employeeService.addEmployee(new Employee(1L, "Daniel", "Maldonado", 38, "Instructor", 95366.22d));
		employeeService.addEmployee(new Employee(2L, "Fer", "Aguilar", 23, "Instructor", 102385.12d));
		employeeService.addEmployee(new Employee(3L, "Angel", "Lira", 26, "Backend Dev", 145271.04d));
		
		System.out.println(employeeService.getEmpleados());
		
		//Buscar Employee por ID
		System.out.println("El usuario con el id 2 es: " + employeeService.findById(2L));//Output: Fer Aguilar
		System.out.println("El usuario con el id 2 usando Iterator es: " + employeeService.getById(2L));//Output: Fer Aguilar
		
		//System.out.println(employeeService.findById(10L));//OUTPUT: Lanza Exception
		//System.out.println(employeeService.getById(11L));//Output: Lanza Exception
		
		//Agregar un nuevo Employee al ArrayList que después voy a eliminar
		employeeService.addEmployee(new Employee(4L, "Jorge", "Mendoza", 25, "Manager", 136225d));
		
		System.out.println(employeeService.getEmpleados());
		
		//Eliminar un Employee por su ID
		
		employeeService.deleteEmployee(4L);
		System.out.println("\nEliminando el empleado con id 4: " + employeeService.getEmpleados());
		
		//Mandar a llamar el método calcularSalario();
		System.out.println(employeeService.getById(1L).calcularSalario());
	
	}//main

}//EmployeeMain
