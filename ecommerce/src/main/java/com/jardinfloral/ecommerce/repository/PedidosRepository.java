package com.jardinfloral.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jardinfloral.ecommerce.model.Pedido;

@Repository
public interface PedidosRepository  extends JpaRepository<Pedido,Integer>{
	
}
