package org.generation.employee.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.generation.employee.model.Manager;

public class ManagerService {
	
	private List<Manager> managers = new ArrayList<>();
	
	//Agregar Managers
	public void addManager(Manager manager) {
		managers.add(manager); 
	}
	
	//Obtener todos los Managers
	public List<Manager> getManagers() {
		return managers;
	}
	
	//Método para buscar un Manager mediante id pero utilizando Iterator();
	public Manager managerGetById(Long id) {
		Iterator<Manager> iterator = managers.iterator();
		
		while(iterator.hasNext()) {
			Manager manager = iterator.next();
			if (manager.getId().equals(id)) {
				return manager;
			}
		}
		//Lanzar una Exception en caso de no encontrar al manager con el Id
		throw new EmployeeNotFoundException("El manager con el id: " + id + "no se encuentra!!!");
	}

}
