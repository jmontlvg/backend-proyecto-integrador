package org.generation.ecommerce.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;

public class JwtFilter extends GenericFilterBean {
	
	public static String secret = "LaCH49#PareceMuda$yNoHanTerminadoSusCVs";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// Request - Solicitud
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		// Header Authorization
		String authHeader = httpServletRequest.getHeader("Authorization");// Se trae el Header
		
		if(("POST".equals(httpServletRequest.getMethod()) &&				
			(!httpServletRequest.getRequestURI().contains("/api/usuarios/")))
			||
			("GET".equals(httpServletRequest.getMethod()) &&
			(!httpServletRequest.getRequestURI().contains("/api/productos/")))
			|| ("PUT".equals(httpServletRequest.getMethod()))
			|| ("DELETE".equals(httpServletRequest.getMethod()))
		
		) {		
		
		// URLs /api/usuarios/ GET, PUT, DELETE
		// /api/productos/ DELETE, PUT , POST
			
			
		
		// Bearer
		if(authHeader == null || !authHeader.startsWith("Bearer: ")) {// Se valida que hay un encabezado o que empiece con 'Bearer: '
			System.out.println("1. Invalid Token");
			throw new ServletException("1. Invalid Token");
		} // if
		
		
		
		// Validación de Token
		String token = authHeader.substring(7);
		try {
			Claims claims = Jwts.parser().setSigningKey(secret)
					.parseClaimsJws(token).getBody();
			claims.forEach((key, value) -> System.out.println("Key: " + key + "value: " + value));
		} catch (SignatureException | MalformedJwtException | ExpiredJwtException e) {
			System.out.println("2. Invalid Token");
				throw new ServletException("2. Invalid Token");			
		} //catch
		chain.doFilter(request, response);
	}// if getMethod
	}// doFilter
} // class JwtFilter
