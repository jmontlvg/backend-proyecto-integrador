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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jardinfloral.ecommerce.model.Pedido;
import com.jardinfloral.ecommerce.service.PedidosService;

@RestController
@RequestMapping(path = "/api/pedidos/")
public class PedidosController {
	private final PedidosService pedidosService;

	@Autowired
	public PedidosController(PedidosService pedidoService) {
		this.pedidosService = pedidoService;
	}

	@GetMapping
	public List<Pedido> getPedidos() {
		return pedidosService.getAllPedidos();
	}

	@GetMapping(path = "{pedidoId}")
	public Pedido getPedido(@PathVariable("pedidoId") Integer id) {
		return pedidosService.getPedido(id);
	}

	@DeleteMapping(path = "{pedidoId}")
	public Pedido deletePedido(@PathVariable("pedidoId") Integer id) {
		return pedidosService.deletePedido(id);
	}

	@PostMapping
	public Pedido addPedido(@RequestBody Pedido pedido) {
		return pedidosService.addPedido(pedido);
	}

	@PutMapping(path = "{pedidoId}")
	public Pedido updatePedido(@PathVariable("pedidoId") Integer id, 
			@RequestParam(required = false) Double cantidadPagada,
			@RequestParam(required = false) Integer cantidadVendida) {
		return pedidosService.updatePedido(id, cantidadPagada, cantidadVendida);
	}// update

}
