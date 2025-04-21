package org.generation.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.ecommerce.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService2 {	
	private final List<Producto> lista = new ArrayList<Producto>();
	
	@Autowired
	public ProductoService2() {
		lista.add(new Producto(
				"Cuaderno doble raya", 
				"Cuaderno 100 hojas doble raya profesional", 
				"cuaderno.png", 89.90));
		lista.add(new Producto(
				"Cuaderno cuadro chico", 
				"Cuaderno 100 hojas cuadro chico profesional", 
				"cuaderno.png", 92.90));
		lista.add(new Producto(
				"Cuaderno forma italiana raya", 
				"Cuaderno 100 hojas forma italiana raya", 
				"cuaderno.png", 70.95));
		lista.add(new Producto(
				"Cuaderno cuadro grande profesional", 
				"Cuaderno 100 cuadro grande profesional", 
				"cuaderno.png", 97.90));
		lista.add(new Producto(
				"Cuaderno pautado", 
				"Cuaderno 100 hojas pautado profesional", 
				"cuaderno.png", 49.90));
		lista.add(new Producto(
				"Cuaderno hojas blancas", 
				"Cuaderno 100 hojas blancas profesional", 
				"cuaderno.png", 59.90));
	} // ProductoService

	public List<Producto> getAllProducts() {
		return lista;
	} // getAllProducts

	public Producto getProduct(Long id) {		
		Producto prod = null;
		for (Producto producto : lista) {
			if (producto.getId() == id) {
				prod = producto;
				break;
			} // if			
		} // foreach		
		return prod;
	} // getProduct

	public Producto deleteProduct(Long id) {
		Producto prod = null;
		for (Producto producto : lista) {
			if (producto.getId() == id) {
				prod = producto;
				lista.remove(producto);
				break;
			} // if			
		} // foreach		
		return prod;
	}

	public Producto addProduct(Producto producto) {
		lista.add(producto);
		return producto;
	} // addProducto

	public Producto updateProduct(Long id, String nombre, 
			String descripcion, String imagen, Double precio) {
		Producto prod = null;
		for (Producto producto : lista) {
			if (producto.getId() == id) {
				if(nombre != null) producto.setNombre(nombre);
				if(descripcion != null) producto.setDescripcion(descripcion);
				if(imagen != null) producto.setImagen(imagen);
				if(precio != null) producto.setPrecio(precio);
				prod = producto;				
				break;
			} // if			
		} // foreach		
		return prod;
	}

} // class ProductoService
