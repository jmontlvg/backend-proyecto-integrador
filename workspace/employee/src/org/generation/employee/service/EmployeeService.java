package org.generation.employee.service;

import org.generation.employee.model.Employee;

public class EmployeeService {
	
	
	//Método para recuperar a todos los empleados
	public List<Employee> getEmpleados(){
		return empleados;
	}
	
	//Método que agregue empleados
	public void addEmployee(Employee employee) {
		empleados.add(employee);
	}
	
	public Employee findById(Long id) {
		return empleados.stream()
				.filter(employee -> empleado.getId().equals(id))
				.findFirst();//Retorna el primer elemento
				.orElseThrow(() -> new EmployeeNotFoundExcepction("El empleado con el id: " + id + "no se encuentra!!!"));
		
	}
	
	//Método para buscar un Empleado mediante ID pero utilizando Iterator();
	public Employee getById(Long id) {
		Iterator<Employee> iterator = empleados.iterator();
		
		while(iterator.hasNext()) {
			Employee empleado = iterator.next();
			if (empleado.getId().equals(id)) { 
				return empleado;
			}			
		}
		//Lanzar una Exception en caso de no encontrar al empleado con el ID
		throw new EmployeeNotFoundException("El empleado con el id: " + id + "no se encuentra!!!");
		
	}
	
	//Método para eliminar un Employee

}
