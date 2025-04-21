package org.generation.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.model.Categoria;
import org.generation.ecommerce.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriasService {
	public final CategoriasRepository categoriasRepository;
	
	@Autowired
	public CategoriasService(CategoriasRepository categoriasRepository) {
		this.categoriasRepository = categoriasRepository;
	} // constructor
	
	// 1. getAll
	public List<Categoria> getAllCategorias() {
		return categoriasRepository.findAll();
	} // getAllCategorias
	
	// 2. get 1
	public Categoria getCategoria(Long id) {		
		return categoriasRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("La categoría con el id ["
						+ id + "] no existe."));
	} // getCategoria
	
	// 3. delete
	public Categoria deleteCategoria(Long id) {
		Categoria cat = null;
		if(categoriasRepository.existsById(id)) {
			cat = categoriasRepository.findById(id).get();
			categoriasRepository.deleteById(id);
		} // if existsById				
		return cat;
	} // deleteCategoria
	
	// 4. add
	public Categoria addCategoria(Categoria categoria) {
		Optional<Categoria> cat = categoriasRepository.findByNombre(categoria.getNombre());
		if(cat.isEmpty()) {// No existe el nombre
			return categoriasRepository.save(categoria);
		} else {
			System.out.println("La categoria [" + categoria.getNombre()
			+ "] ya se encuentra registrado");
			return null;
		}// if isEmpty
	} //addCategoria
	
	
	// 5. update
	
	public Categoria updateCategoria(Long id, String nombre, String descripcion) {
		Categoria cat=null;
		if(categoriasRepository.existsById(id)) {
		Categoria categoria = categoriasRepository.findById(id).get();
		if(nombre!=null) categoria.setNombre(nombre);
		if(descripcion!=null) categoria.setDescripcion(descripcion);
		categoriasRepository.save(categoria);
		cat = categoria;
	}// exists
		return cat;
	}// updateCategoria
	

} // class UsuariosService
