package com.jardinfloral.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardinfloral.ecommerce.model.Pedido;
import com.jardinfloral.ecommerce.repository.PedidosRepository;

@Service
public class PedidosService {
	private final PedidosRepository pedidosRepository;
	
	@Autowired
	public PedidosService(PedidosRepository pedidosRepository) {
		this.pedidosRepository = pedidosRepository;
	}
	
	public List<Pedido> getAllPedidos(){
		return pedidosRepository.findAll();
	}// getAllPedidos
	
	public Pedido getPedido(Integer id) {
		return pedidosRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("El pedido con el id: ["+id+"] no existe."));
	}// getPedido
	
	public Pedido deletePedido(Integer id) {
		Pedido ped = null;
		if(pedidosRepository.existsById(id)) {
			ped = pedidosRepository.findById(id).get();
			pedidosRepository.deleteById(id);
		}
		return ped;
	}// deletePedido
	
	public Pedido addPedido(Pedido pedido) {
		return pedidosRepository.save(pedido);
	}// addPedido
	
	public Pedido updatePedido(Integer id, Double cantidadPagada, Integer cantidadVendida) {
		Pedido ped = null;
		if(pedidosRepository.existsById(id)) {
			Pedido pedido = pedidosRepository.findById(id).get();
			if(cantidadPagada != null) pedido.setCantidadPagada(cantidadPagada);
			if(cantidadVendida != null) pedido.setCantidadVendida(cantidadVendida);
			pedidosRepository.save(pedido);
			ped = pedido;
		}
    	return ped;
	}// updatePedido
	
}// PedidosService

