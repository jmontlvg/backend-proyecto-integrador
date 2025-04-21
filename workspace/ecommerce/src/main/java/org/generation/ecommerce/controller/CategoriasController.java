package org.generation.ecommerce.controller;

import java.util.List;


import org.generation.ecommerce.model.Categoria;
import org.generation.ecommerce.service.CategoriasService;
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
@RequestMapping(path="/api/categorias/")
public class CategoriasController {
	
private final CategoriasService categoriasService;
	
	@Autowired
	public CategoriasController(CategoriasService categoriasService) {
		this.categoriasService = categoriasService;
	} // constructor
	
	// getMapping2	
		@GetMapping	
		public List<Categoria> getCategorias() {
			return categoriasService.getAllCategorias();
		} // getCategorias
		
		@GetMapping(path = "{id}")// http://localhost:8080/api/categorias/1	
		public Categoria getCategoria(@PathVariable("id")Long id) {
			return categoriasService.getCategoria(id);
		} // getCategoria
		
		
		
		@PostMapping// http://localhost:8080/api/categorias/	
		public Categoria addCategoria(@RequestBody Categoria categoria) {
			return categoriasService.addCategoria(categoria);
		} // addCategoria
		
		
		// deleteMapping
		@DeleteMapping(path = "{id}")// http://localhost:8080/api/categorias/1	
		public Categoria deleteCategoria(@PathVariable("id")Long id) {
			return categoriasService.deleteCategoria(id);
		} // deleteCategoria
		
		
		
		
		@PutMapping(path="{id")// http://localhost:8080/api/categorias/1
		public Categoria updateCategoria(@PathVariable("id") Long id,
				@RequestParam(required=false) String nombre,
				@RequestParam(required=false) String descripcion) {
			return categoriasService.updateCategoria(id, nombre, descripcion);		
		} // updateCategoria
		

}
