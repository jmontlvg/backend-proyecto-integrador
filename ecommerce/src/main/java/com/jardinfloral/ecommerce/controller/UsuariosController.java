package com.jardinfloral.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jardinfloral.ecommerce.dto.ChangePassword;
import com.jardinfloral.ecommerce.model.Usuario;
import com.jardinfloral.ecommerce.service.UsuariosService;

@RestController
@RequestMapping(path="/api/usuarios/")
public class UsuariosController {
	private final UsuariosService usuariosService;

	@Autowired
	public UsuariosController(UsuariosService usuarioService) {
		this.usuariosService = usuarioService;
	} //UsuariosController

	@GetMapping
	public List<Usuario> getUsuarios() {
		return usuariosService.getAllUsuarios(); //revisar aquí
	}
	@GetMapping(path="{usuarioId}")
	public Usuario getUsuario(@PathVariable("usuarioId") Integer id) {
		return usuariosService.getUsuario(id);
	}
	@DeleteMapping(path="{usuarioId}")
	public Usuario deleteUsuario(@PathVariable("usuarioId") Integer id) {
		return usuariosService.deleteUsuario(id);
	}
	@PostMapping
	public Usuario addUsuario(@RequestBody Usuario usuario) {
		return usuariosService.addUsuario(usuario);
	}

	@PutMapping(path="/{userId}")
	public Usuario updateUsuario(@RequestBody ChangePassword changePassword,
		@PathVariable("userId") Integer id){
			return usuariosService.updateUsuario(id, changePassword);
		}

}//UsuariosController

