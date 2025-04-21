package org.generation.employee.main;

import org.generation.employee.model.developer.Developer;
import org.generation.employee.model.developer.ProgrammingLanguage;
import org.generation.employee.service.DeveloperService;

public class DeveloperMain {
	
	public static void main(String[] args) {
		DeveloperService developerService = new DeveloperService();
		
		developerService.addDeveloper(new Developer(1L, "Adrian", "Camacho", 25, "Backend Dev", 12122.24d, ProgrammingLanguage.PYTHON));
		
		System.out.println(developerService.getDevelopers());
		
		//Prueben los demás métodos de DeveloperService
	}

}
