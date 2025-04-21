package com.jardinfloral.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardinfloral.ecommerce.model.Producto;

@Repository
public interface ProductosRepository extends JpaRepository<Producto, Long> {
	Optional<Producto> findByNombre(String nombre);
}//Interface ProductosRepository
