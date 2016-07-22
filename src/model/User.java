package model;

public class User extends Persona{
	private int edad;
	private String direccion;
	private String telefono;
	private String nombre;
	private String apellido; 
	
	public User(String nombre, String apellido, int edad, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		
		this.edad = edad;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	public User(String usuario,String contraseña) {
		super();
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
