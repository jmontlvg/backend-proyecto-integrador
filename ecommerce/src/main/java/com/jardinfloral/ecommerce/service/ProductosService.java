package com.jardinfloral.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jardinfloral.ecommerce.model.Producto;
import com.jardinfloral.ecommerce.repository.ProductosRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    private final ProductosRepository productoRepository;

    @Autowired
    public ProductosService(ProductosRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

 
    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }//getALL


    public Producto getProduct(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("El producto con el ID [" + id + "] no existe."));
    }//getID


    public Producto addProduct(Producto producto) {
        Optional<Producto> prod = productoRepository.findByNombre(producto.getNombre());
        if (prod.isEmpty()) {
            return productoRepository.save(producto);
        } else {
            return null;
        }
    }//add

    

    public Producto deleteProduct(Long id) {
    	Producto prod = null;
		if(productoRepository.existsById(id)) {
			prod = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}
		return prod;
    }//delete
    
    public Producto updateProducto(Long id, String nombre, Double precio, String color, Integer stock, String descripcion, String imagen) {
    	Producto prod = null;
    	if(productoRepository.existsById(id)) {
    		Producto producto = productoRepository.findById(id).get();
    		if(nombre != null) producto.setNombre(nombre);
    		if(precio != null) producto.setPrecio(precio);
    		if(color != null) producto.setColor(color);
    		if(stock != null) producto.setStock(stock);
			if(descripcion != null) producto.setDescripcion(descripcion);
			if(imagen != null) producto.setImagen(imagen);
			productoRepository.save(producto);
			prod = producto;
    	}
    	return prod;
    }
}
