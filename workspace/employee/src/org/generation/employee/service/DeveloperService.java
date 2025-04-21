package org.generation.employee.service;

/*
 * Crear clases para Developer: 
 * - Agregar Developers, 
 * - Obtener a todos los Developers,
 * - Obtener un Developer por Id,
 * - Eliminar un Developer por Id,
 * - Obtener el lenguaje de programación del Developer 
 */

public class DeveloperService {
	
	public List<Developer> developers = new ArrayList<>();
	
	//Agregar Developers
	public void addDeveloper(Developer developer) {
		developers.add(developers);
	}
	
	//Obtener a todos los Developers
	public List<Developer> getDevelopers(){
		return developers;
	}	
	
	//Obtener un Developer por Id
	public Developer getById(Long id) {
        for (Developer developer : developers) {
            if (developer.getId().equals(id)) {
                return developer;
            }
        }        
    }
	
	//Eliminar un Developer por Id,
	public void deleteById(Long id) {
        Iterator<Developer> iterator = developers.iterator();
        while (iterator.hasNext()) {
            Developer developer = iterator.next();
            if (developer.getId().equals(id)) {
                iterator.remove();
                return;
            }
        }        
    }
	
	
	//Obtener el lenguaje de programación del Developer
	public String getLenguajeDeProgramacionById(Long id) {
        Developer developer = getById(id);
        return developer.getLenguajeDeProgramacion();
    }
	

}


/*
 * package org.generation.employee.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.generation.employee.exception.EmployeeNotFoundException;
import org.generation.employee.model.developer.Developer;
import org.generation.employee.model.developer.ProgrammingLanguage;

// Crear métodos para Developer: Agregar Developers, Obtener a todos los Developers, Obtener un Developer por Id, Eliminar un Developer por Id, Obtener el lenguaje de programación del Developer
public class DeveloperService {

	private List<Developer> developers = new ArrayList<>();
	
	// Agregar Developers
    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }
	
	// Obtener a todos los Developers
    public List<Developer> getDevelopers() {
        return developers;
    }
    
}

// Obtener un Developer por Id
	public Developer getById(Long id) {
		Iterator<Developer> iterator = developers.iterator();
		
		while(iterator.hasNext()) {
			Developer developer = iterator.next();
			if (developer.getId().equals(id)) {
				return developer;			
			}
		}
		// Lanzar una Exception en caso de no encontrar al developer con el Id
		throw new EmployeeNotFoundException("El developer con el id: " + id + " no se encuentra!!!");
	}
	
	// Eliminar un Developer por Id
	public void deleteDeveloper(Long id) {
		Developer developer = getById(id);
		// Eliminar al empleado (remove)
		developers.remove(developer);
	}
	
	// Obtener el lenguaje de programación del Developer por Id
    public ProgrammingLanguage getLanguage(Long id) {
        Developer developer = getById(id);
    	return developer.getLanguage();
    }
 */

