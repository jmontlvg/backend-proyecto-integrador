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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="usuarioID", unique=true, nullable=false)
	private Integer id;
	@Column(name="nombre", nullable=false)
	private String nombre;
	@Column(name="apepaterno", unique=false, nullable=false)
	private String ape_p;
	@Column(name="apematerno", unique=false, nullable=false)
	private String ape_m;
	@Column(name="telefono", unique=true, nullable=false)
	private	Long telefono;
	@Column(name="correo", unique=true, nullable=false)
	private String correo;
	@Column(name="contrasena", nullable=false)
	private String password;
	@Column(name="rol", nullable=false)
	private String rol;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="usuarioId", referencedColumnName = "usuarioID")
	private List<Pedido> pedidos = new ArrayList<Pedido>();

	

	
	//Constructor vacío
	public Usuario() {}

	//Constructor con parámetros
	public Usuario(String nombre, String ape_p, String ape_m, Long telefono, String correo, String password) {
			
		this.nombre = nombre;
		this.ape_p = ape_p;
		this.ape_m = ape_m;
		this.telefono = telefono;
		this.correo = correo;
		this.password = password;
	}

	//Getters y Setters	

	public Integer getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApe_p() {
		return ape_p;
	}



	public void setApe_p(String ape_p) {
		this.ape_p = ape_p;
	}



	public String getApe_m() {
		return ape_m;
	}



	public void setApe_m(String ape_m) {
		this.ape_m = ape_m;
	}



	public Long getTelefono() {
		return telefono;
	}



	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}



	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", ape_p=" + ape_p + ", ape_m=" + ape_m + ", telefono="
				+ telefono + ", correo=" + correo +", password=" + password +  "]";
	}
	


}

