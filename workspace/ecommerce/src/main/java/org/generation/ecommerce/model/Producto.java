package org.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Esto indica que esta clase será una TABLA
@Table(name="productos") // Este será el nombre de la tabla
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id; // Se utilizan clases Wrapper y no datos primitivos
	@Column(nullable=false)
	private String nombre;
	private String descripcion;
	private String imagen;
	@Column(nullable=false)
	private Double precio;
	@Column(nullable=false)
	private Long categoriaid;
	
	// private static Long total = Long.valueOf(0);
	
	// 1. Constructor
	
	// 1.1 Default - Vacío
	public Producto() {
		//Producto.total++;
		//this.id = Producto.total;
	}
	
	public Long getCategoriaid() {
		return categoriaid;
	}

	public void setCategoriaid(Long categoriaid) {
		this.categoriaid = categoriaid;
	}

	// 1.2 Todos los parámetros excepto 'id'
	public Producto(String nombre, String descripcion, String imagen, Double precio) {
		super(); // Llama a la clase padre
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.precio = precio;
		//Producto.total++;
		//this.id = Producto.total;
	}	
	
	// 2. Getters and Setters
	public Long getId() {
		return id;
	}
	

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	// 3. toString()
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ ", precio=" + precio + "]";
	}

	
	
} // class Producto
