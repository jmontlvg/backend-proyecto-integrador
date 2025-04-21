package com.jardinfloral.ecommerce.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardinfloral.ecommerce.Config.JwtFilter;
import com.jardinfloral.ecommerce.dto.Token;
import com.jardinfloral.ecommerce.model.Usuario;
import com.jardinfloral.ecommerce.service.UsuariosService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/api/login/")
public class LoginController {
	private final UsuariosService usuarioService;
	@Autowired
	public LoginController(UsuariosService usuarioService) {
		this.usuarioService = usuarioService;
	}//Constructor
	
	@PostMapping
	public Token loginUser(@RequestBody Usuario usuario) throws ServletException {
		if(usuarioService.validateUser(usuario)) {
		return new Token(generateToken(usuario.getCorreo()));
		}//ifvalidate
		throw new ServletException("El nombre de usuario o Contraseña son incorrectos ("
				+usuario.getCorreo()+")");
	}//LoginUser
	
	private String generateToken(String correo) {
	   Calendar calendar = Calendar.getInstance();
	   calendar.add(Calendar.HOUR, 12);
	   return Jwts.builder().setSubject(correo).claim("role","user")
			   .setIssuedAt(new Date())
			   .setExpiration(calendar.getTime())
			   .signWith(SignatureAlgorithm.HS256,JwtFilter.secret)
			   .compact();
	}
		
	
}//ClassLoginController
