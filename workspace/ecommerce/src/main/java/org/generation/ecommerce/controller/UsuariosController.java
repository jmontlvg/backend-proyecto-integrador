package org.generation.ecommerce.controller;

import java.util.List;

import org.generation.ecommerce.dto.ChangePassword;
import org.generation.ecommerce.model.Usuario;
import org.generation.ecommerce.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/usuarios/")
public class UsuariosController {
	
	private final UsuariosService usuariosService; // Esto permite tener acceso al servicio de usuarios, el cual es único
	
	@Autowired
	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	} // constructor
	
	
	
	// getMapping2	
	@GetMapping	
	public List<Usuario> getUsuarios() {
		return usuariosService.getAllUsuarios();
	} // getUsuarios
	
	
	
	@GetMapping(path = "{userId}")	
	public Usuario getUsuario(@PathVariable("userId")Long id) {
		return usuariosService.getUsuario(id);
	} // getUsuario
	
	
	
	// deleteMapping
	@DeleteMapping(path = "{userId}")	
	public Usuario deleteUsuario(@PathVariable("userId")Long id) {
		return usuariosService.deleteUsuario(id);
	} // deleteUsuario
	
	
	
	// postMapping
	@PostMapping	
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuariosService.addUsuario(usuario);
	} // addUsuario
	
	
	
	@PutMapping(path="{userId")
	public Usuario updateUsuario(@RequestBody ChangePassword changePassword,
			@PathVariable("userId") Long id) {
		return usuariosService.updateUsuario(id, changePassword);		
	} // updateUsuario
		
	
	
	

} // class UsuariosController
