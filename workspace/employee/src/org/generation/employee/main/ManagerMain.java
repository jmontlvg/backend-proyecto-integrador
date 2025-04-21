package org.generation.employee.main;

import org.generation.employee.model.Manager;
import org.generation.employee.service.ManagerService;

public class ManagerMain {
	public static void main(String[] args) {
		//Crear instancia de ManagerService
		ManagerService managerService = new ManagerService();
		
		//Agregar Managers
		managerService.addManager(new Manager(1L, "Sofia", "Garcia", 24, 254366d, 12000d));
		managerService.addManager(new Manager(2L, "Kemble", "Monroy", 25, 254366d, 10500d));
		
		//Recuperar todos los Managers
		System.out.println(managerService.getManagers(2L).calcularSalario());
		
		//Probando método calcularSalario
		System.out.println("El salario del manager 2 es de $"managerService.getManagers().);
		
	}//main

}//ManagerMain
