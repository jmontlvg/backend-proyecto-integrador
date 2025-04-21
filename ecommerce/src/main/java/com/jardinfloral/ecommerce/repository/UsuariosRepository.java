package com.jardinfloral.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardinfloral.ecommerce.model.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	Optional<Usuario> findByCorreo(String correo);
}
