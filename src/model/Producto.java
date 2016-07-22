package model;

public class Producto {
	private int id;
	private String nombre; 
	private float precio;
	private int stock;
	private String categoria;
	private int estado;
	
	
	public Producto() {
		super();
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Producto( String nombre, float precio, int stock, String categoria) {
		super();
		this.id = 0;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
