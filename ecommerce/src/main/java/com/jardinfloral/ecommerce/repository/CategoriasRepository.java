package com.jardinfloral.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardinfloral.ecommerce.model.Categoria;


@Repository
public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	Optional<Categoria> findByNombre(String nombre);
}//Interface CategoriasRepository

