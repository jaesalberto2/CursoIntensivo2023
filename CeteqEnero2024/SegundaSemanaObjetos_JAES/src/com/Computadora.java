package com;

public class Computadora {
	
	private String marca, procesador;
	private int memoria, ram, a�o;
	
	//VACIO
	Computadora(){
		
	}
	//COMPLETO

	public Computadora(String marca, String procesador, int memoria, int ram, int a�o) {
		super();
		this.marca = marca;
		this.procesador = procesador;
		this.memoria = memoria;
		this.ram = ram;
		this.a�o = a�o;
	}
	
	//GETTER Y SETTERS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	
	//ToString

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", procesador=" + procesador + ", memoria=" + memoria + ", ram=" + ram
				+ ", a�o=" + a�o + "]";
	}
	
	
	
	
	
	
	
	
	

}
