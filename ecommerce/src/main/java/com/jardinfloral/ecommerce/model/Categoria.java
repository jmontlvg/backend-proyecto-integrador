package com.jardinfloral.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoriasID", unique = true, nullable = false)
    private Integer id;
    @Column(name = "nombrecategoria", nullable = false, length = 45)
    private String nombre;

    @Column(name = "descripcioncategoria", nullable = false, length = 300)
    private String descripcion;
    
    @ManyToMany(mappedBy = "categorias")
    List<Producto> productos = new ArrayList<Producto>();
    //private Set<Producto> subscriptions;   
    //Set<Producto> productos = new HashSet<>();
    
    public Categoria() {}//constructor vacio

	public Categoria(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	//Getters y Setters
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

	public Integer getId() {
		return id;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	//toString
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
    
    
}
