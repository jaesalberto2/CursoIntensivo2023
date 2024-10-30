package com;

public class Torta {
	
	private String nombre,tipoPan,inPrincipal;
	private int precio,peso;
	//VACIO
	public Torta() {
		
	}
	//TODOS LOS PARAMETROS
	public Torta(String nombre, String tipoPan, String inPrincipal, int precio, int peso) {
		super();
		this.nombre = nombre;
		this.tipoPan = tipoPan;
		this.inPrincipal = inPrincipal;
		this.precio = precio;
		this.peso = peso;
		
	//GETTERS Y SETTERS
		
		
		
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipoPan() {
		return tipoPan;
	}
	public void setTipoPan(String tipoPan) {
		this.tipoPan = tipoPan;
	}
	public String getInPrincipal() {
		return inPrincipal;
	}
	public void setInPrincipal(String inPrincipal) {
		this.inPrincipal = inPrincipal;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Torta [nombre=" + nombre + ", tipoPan=" + tipoPan + ", inPrincipal=" + inPrincipal + ", precio="
				+ precio + ", peso=" + peso + "]";
	}
	
	//toSTRING
	
	
	

}
