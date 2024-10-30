package com;

public class Computadora {
	
	//Existen atributos que tambien pueden ser objetos
	//se cran primero para que puedan ser un tipo 
	//de dato en este otro
	private String tipo, marca, modelo;
	private Almacenamiento disco;
	private Memoria ram;
	
	public Computadora(){
		
	}

	public Computadora(String tipo, String marca, String modelo, Almacenamiento disco, Memoria ram) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.disco = disco;
		this.ram = ram;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Memoria getRam() {
		return ram;
	}

	public void setRam(Memoria ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computadora [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", disco=" + disco + ", ram="
				+ ram + "]";
	}
	
	

}
