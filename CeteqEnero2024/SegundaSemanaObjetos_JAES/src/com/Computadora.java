package com;

public class Computadora {
	
	private String marca, procesador;
	private int memoria, ram, año;
	
	//VACIO
	Computadora(){
		
	}
	//COMPLETO

	public Computadora(String marca, String procesador, int memoria, int ram, int año) {
		super();
		this.marca = marca;
		this.procesador = procesador;
		this.memoria = memoria;
		this.ram = ram;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
	//ToString

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", procesador=" + procesador + ", memoria=" + memoria + ", ram=" + ram
				+ ", año=" + año + "]";
	}
	
	
	
	
	
	
	
	
	

}
