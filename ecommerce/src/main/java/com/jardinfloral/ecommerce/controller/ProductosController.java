package com.jardinfloral.ecommerce.controller;

//Mismamente aqui tambien solo traer las librerias necesarias evitar el uso del *
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

import com.jardinfloral.ecommerce.model.Producto;
import com.jardinfloral.ecommerce.service.ProductosService;

import java.util.List;

@RestController
@RequestMapping("/api/productos/")
public class ProductosController {

    private final ProductosService productosService;

    @Autowired
    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }//ProductosControllerconst

  
    @GetMapping
    public List<Producto> getProductos() {
        return productosService.getAllProducts();
    }//getAll

    
    @GetMapping("{id}")
    public Producto getProducto(@PathVariable("id") Long id) {
        return productosService.getProduct(id);
    }// getId

   
    @PostMapping
    public Producto addProducto(@RequestBody Producto producto) {
        return productosService.addProduct(producto);
    }//add

  
    @DeleteMapping("{id}")
    public Producto deleteProducto(@PathVariable("id") Long id) { 
        return productosService.deleteProduct(id);
    }//delete
    

    @PutMapping(path="{prodId}")
    public Producto updateProducto(@PathVariable("prodId") Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) Double precio,
			@RequestParam(required = false) String color,
			@RequestParam(required = false) Integer stock,
			@RequestParam(required = false) String descripcion,
			@RequestParam(required = false) String imagen) {
		return productosService.updateProducto(id, nombre, precio, color, stock, descripcion, imagen);
	}

}//classProductosController

