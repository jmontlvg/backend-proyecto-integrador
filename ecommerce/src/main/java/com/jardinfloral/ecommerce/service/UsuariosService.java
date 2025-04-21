package com.jardinfloral.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jardinfloral.ecommerce.dto.ChangePassword;
import com.jardinfloral.ecommerce.model.Usuario;
import com.jardinfloral.ecommerce.repository.UsuariosRepository;

@Service
public class UsuariosService {
	@Autowired
	private PasswordEncoder encoder;
	private final UsuariosRepository usuariosRepository;

	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}

	public List<Usuario> getAllUsuarios() {
		return usuariosRepository.findAll();
	}

	public Usuario getUsuario(Integer id) {
		return usuariosRepository.findById(id).orElseThrow(
			() -> new IllegalArgumentException("El usuario con el ID: [" + id + "] no existe."));
	}	

	public Usuario deleteUsuario(Integer id) {
		Usuario user = null;
		if(usuariosRepository.existsById(id)) {
			user = usuariosRepository.findById(id).get();
			usuariosRepository.deleteById(id);
		}
		return user;
	}

	public Usuario addUsuario(Usuario usuario) {
		Optional<Usuario> user = usuariosRepository.findByCorreo(usuario.getCorreo());
		if(user.isEmpty()) {
			usuario.setPassword(encoder.encode(usuario.getPassword()) );
			return usuariosRepository.save(usuario);
		}else {
			return null;
		}//else
		
	}//addUsuario

	//5. Update
		public Usuario updateUsuario(Integer id, ChangePassword changePassword) {
			Usuario user = null;
			if(usuariosRepository.existsById(id)) {
				Usuario usuario = usuariosRepository.findById(id).get();
				//if(usuario.getPassword().equals(changePassword.getPassword())) {
				if(encoder.matches(changePassword.getPassword(), usuario.getPassword())) {
				   usuario.setPassword(encoder.encode(changePassword.getPassword()));
				   user=usuario;
				   usuariosRepository.save(usuario);
				}//Equals
			}//exist
			return user;
		}//update

		public boolean validateUser(Usuario usuario) {
             Optional<Usuario> user =usuariosRepository.findByCorreo(usuario.getCorreo());
             if(user.isPresent()) {
            	 Usuario tmpUser = user.get();
            	 //tmpUser.getPassword().equals(usuario.getPassword())
            	 if(encoder.matches(usuario.getPassword(),tmpUser.getPassword())) {
            		 return true;
            	 }//ifEquals
             }//if isPresent
			return false;
		}//ValidateUser
}//class UsuariosService

