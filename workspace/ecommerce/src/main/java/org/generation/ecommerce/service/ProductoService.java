package org.generation.ecommerce.service;

// import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	// private final List<Producto> lista = new ArrayList<Producto>(); // final
	// indica que es una constante
	public final ProductosRepository productosRepository;

	@Autowired
	public ProductoService(ProductosRepository productosRepository) {
		this.productosRepository = productosRepository;
	} // constructor ProductoService

	public List<Producto> getAllProducts() {
		return productosRepository.findAll();
	} // getAllProducts

	public Producto getProduct(Long id) {
		return productosRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("El producto con el id [" + id + "] no existe."));
	} // getProduct

	public Producto deleteProduct(Long id) {
		Producto prod = null;
		if (productosRepository.existsById(id)) {
			prod = productosRepository.findById(id).get(); // El findById regresa un Optional
			productosRepository.deleteById(id);
		} // if existsById
		return prod;
	} // deleteProduct

	public Producto addProduct(Producto producto) {
		Optional<Producto> prod = productosRepository.findByNombre(producto.getNombre());
		if (prod.isEmpty()) { // Si no encuentra el producto, lo guarda, si no, entonces regresa un nulo
			productosRepository.save(producto);
			return producto;
		} else {
			return null;
		} // else
	} // addProduct

	public Producto updateProduct(Long id, String nombre, String descripcion, String imagen, Double precio, Long categoriaid) {
		Producto prod = null;
		if (productosRepository.existsById(id)) {
			Producto producto = productosRepository.findById(id).get();
			if (nombre != null)
				producto.setNombre(nombre); // Si fueran datos primitivos no podrían compararse con 'null'
			if (descripcion != null)
				producto.setDescripcion(descripcion);
			if (imagen != null)
				producto.setImagen(imagen);
			if (precio != null)
				producto.setPrecio(precio);
			if (categoriaid != null)
				producto.setCategoriaid(categoriaid);
			productosRepository.save(producto);
			prod = producto;
		} // if

		return prod;
	} // updateProduct

} // class ProductoService
