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

import com.jardinfloral.ecommerce.model.Categoria;
import com.jardinfloral.ecommerce.service.CategoriasService;


@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {
    private final CategoriasService categoriasService;

    @Autowired
    public CategoriasController(CategoriasService categoriasService) {
        this.categoriasService = categoriasService;
    }//CategoriasControllerconst

  
    @GetMapping
    public List<Categoria> getCategorias() {
        return categoriasService.getAllCategorias();
    }//getAll

    
    @GetMapping("{id}")
    public Categoria getCategoria(@PathVariable("id") Integer id) {
        return categoriasService.getCategoria(id);
    }// getId

   
    @PostMapping
    public Categoria addCategoria(@RequestBody Categoria categoria) {
        return categoriasService.addCategoria(categoria);
    }//add

  
    @DeleteMapping("{id}")
    public Categoria deleteCategoria(@PathVariable("id") Integer id) {  
        return categoriasService.deleteCategoria(id);
    }//delete
    
    @PutMapping(path="{id}")
    public Categoria updateCategoria(@PathVariable("catId")Integer id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String descripcion) {
		return categoriasService.updateCategoria(id, nombre, descripcion);
	}//update
}
