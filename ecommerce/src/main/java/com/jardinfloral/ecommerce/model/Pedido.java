package com.jardinfloral.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="pedidoID", unique=true, nullable=false)
	private Integer id;
	@Column(name="fechaventa",unique=false,nullable=false)
	private String fechaVenta;
	@Column(name="cantidadpagada",unique=false,nullable=false)
	private Double cantidadPagada;
	@Column(name="cantidadvendida",unique=false,nullable=false)
	private Integer cantidadVendida;
	@Column (nullable= false)
	private Integer usuarioId;



	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "pedidos_has_productos", joinColumns =
	{ @JoinColumn(referencedColumnName = "pedidoID")}
    , inverseJoinColumns = {@JoinColumn(referencedColumnName = "productosid")})
    List<Producto> productos = new ArrayList<Producto>();
	
	
	//Constructor vacio
	public Pedido() {}
	//Constructor con parametros

	public Pedido(String fechaVenta, Double cantidadPagada, Integer cantidadVendida) {
		this.fechaVenta = fechaVenta;
		this.cantidadPagada = cantidadPagada;
		this.cantidadVendida = cantidadVendida;
	}
	
	//Getters y Setters
	public Integer getId() {
		return id;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Double getCantidadPagada() {
		return cantidadPagada;
	}

	public void setCantidadPagada(Double cantidadPagada) {
		this.cantidadPagada = cantidadPagada;
	}

	public Integer getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(Integer cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	//toString
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaVenta=" + fechaVenta + ", cantidadPagada=" + cantidadPagada
				+ ", cantidadVendida=" + cantidadVendida + "]";
	}
}
