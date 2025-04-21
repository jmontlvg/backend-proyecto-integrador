package org.generation.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que es un controller
@RequestMapping(path = "/api/ch49/") // Indica el ruteo http://localhost:8080/api/ch49/
public class PruebaController {
	
	@GetMapping // Define el método HTTP al que prueba() responde
	public String prueba() {
		return "<h1>¡Hola CH49!</h1><h2>¡Hola Spring Boot!</h2>";
	} //prueba
	

} // class PruebaController
