package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Long> {
	Optional<Categoria> findByNombre(String nombre);

} // interface CategoriasRepository
