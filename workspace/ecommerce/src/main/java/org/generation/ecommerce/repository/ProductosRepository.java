package org.generation.ecommerce.repository;

import java.util.Optional;

import org.generation.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Long> { // Esta interfaz es la que nos permite conectarnos directamente a la BD
	Optional<Producto> findByNombre(String nombre);
	Optional<Producto> findByImagen(String imagen);
} // interface ProductosRepository
