package org.generation.ecommerce.controller;

import java.util.List;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.service.ProductoService;
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

@RestController
@RequestMapping(path = "/api/productos/") // http://localhost:8080/api/productos/
public class ProductosController {
	private final ProductoService productoService;
	
	@Autowired // Esta anotación hace que el mismo servidor le pase el productoService
	public ProductosController(ProductoService productoService) {
		super();
		this.productoService = productoService; // Esto nos brinda una instancia del productoService
	} // constructor
	
	@GetMapping	
	public List<Producto> getProductos() {
		return productoService.getAllProducts();
	} // getProductos
	
	@GetMapping(path = "{prodId}")	// En realidad el prodId es la última parte de la ruta
	public Producto getProducto(@PathVariable("prodId")Long id) { // Aquí ya no tendría que regresar una lista de productos, sino un solo producto
		return productoService.getProduct(id);
	} // getProducto
	
	@DeleteMapping(path = "{prodId}")	
	public Producto deleteProducto(@PathVariable("prodId")Long id) {
		return productoService.deleteProduct(id);
	} // getProducto
	
	@PostMapping	
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProduct(producto);
	} // addProducto
		
	@PutMapping(path = "{prodId}")	
	public Producto updateProducto(@PathVariable("prodId") Long id,
		@RequestParam(required = false) String nombre, // Se coloca false porque así no todos son requeridos para cambiar algún campo
		@RequestParam(required = false) String descripcion,
		@RequestParam(required = false) String imagen,
		@RequestParam(required = false) Double precio,
		@RequestParam(required = false) Long categoriaid) {
			return productoService.updateProduct(id, nombre, descripcion, imagen, precio, categoriaid);
		} // updateProducto
	

} // class ProductosController
