package org.generation.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.dto.ChangePassword;
import org.generation.ecommerce.model.Usuario;
import org.generation.ecommerce.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {

	@Autowired
	private PasswordEncoder encoder;

	private final UsuariosRepository usuariosRepository;

	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	} // constructor UsuariosService

	// 1. getAll
	public List<Usuario> getAllUsuarios() {
		return usuariosRepository.findAll();
	} // getAllUsuarios

	// 2. get 1
	public Usuario getUsuario(Long id) {
		return usuariosRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("El usuario con el id [" + id + "] no existe."));
	} // getUsuario

	// 3. delete
	public Usuario deleteUsuario(Long id) {
		Usuario user = null;
		if (usuariosRepository.existsById(id)) {
			user = usuariosRepository.findById(id).get();
			usuariosRepository.deleteById(id);
		} // if existsById
		return user;
	} // deleteUser

	// 4. add
	
	public Usuario addUsuario(Usuario usuario) { 
	Optional<Usuario> user = usuariosRepository.findByEmail(usuario.getEmail()); 
	if(user.isEmpty()) {
	usuario.setPassword(encoder.encode(usuario.getPassword())); 
	return usuariosRepository.save(usuario); 
	} else { 
		return null; 
	} // else 
	} // addUsuario
	
/*
	public Usuario addUsuario(Usuario usuario) {
		Optional<Usuario> user = usuariosRepository.findByEmail(usuario.getEmail());
		if(user.isPresent()) {
			usuario.tmpUser = user.get();
			if(encoder.matches(usuario, null))
		} else {
			return null;
		} // else
	} // addUsuario
*/

	// 5. update
	public Usuario updateUsuario(Long id, ChangePassword changePassword) {
		Usuario user = null;
		if (usuariosRepository.existsById(id)) {
			Usuario usuario = usuariosRepository.findById(id).get();
			// if (usuario.getPassword().equals(changePassword.getPassword())) {
				if(encoder.matches(changePassword.getPassword(), usuario.getPassword())) {
				usuario.setPassword(encoder.encode(changePassword.getNpassword()));
				user = usuario;
				usuariosRepository.save(usuario);
			}// equals
		}// exist
		return user;
	}// updateUsuario

	public boolean validateUser(Usuario usuario) {
		Optional<Usuario> user = usuariosRepository.findByEmail(usuario.getEmail());
		if (user.isPresent()) {
			Usuario tmpUser = user.get();
			if (encoder.matches(usuario.getPassword(), tmpUser.getPassword())) {
				return true;
			}// if equals
		}// if isPresent
		return false;
	}// validateUser
} // class UsuariosService
