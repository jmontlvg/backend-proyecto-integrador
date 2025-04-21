package org.generation.ecommerce.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.generation.ecommerce.config.JwtFilter;
import org.generation.ecommerce.dto.Token;
import org.generation.ecommerce.model.Usuario;
import org.generation.ecommerce.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/api/login/")

public class LoginController {
	
	private final UsuariosService usuariosService;
	
	@Autowired
	public LoginController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}// constructor
	
		
	// POST
	@PostMapping // http://localhost:8080/api/login/
	public Token loginUser (@RequestBody Usuario usuario) 
			throws ServletException {
		if (usuariosService.validateUser(usuario)) {
			return new Token(generateToken(usuario.getEmail())); // El Token se genera a partir del email del usuario
		} // if validateUser		
		throw new ServletException("Nombre de usuario o contraseña incorrectos [" 
				+ usuario.getEmail() + "]");		
	}// loginUser
	
	
	private String generateToken(String email) {
		Calendar calendar = Calendar.getInstance(); // Genera la fecha y hora del día de hoy
		// calendar.add(Calendar.MINUTE, 30); // Dato más real
		calendar.add(Calendar.HOUR, 12); // Para pruebas
		
		return Jwts.builder().setSubject(email).claim("role", "user")
			.setIssuedAt(new Date())
			.setExpiration(calendar.getTime())
			.signWith(SignatureAlgorithm.HS256, JwtFilter.secret)
			.compact();// Genera un formato compacto de la información
	}// generateToken
	
}// class LoginController
