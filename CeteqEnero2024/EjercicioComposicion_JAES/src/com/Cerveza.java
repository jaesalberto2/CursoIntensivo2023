package com;

public class Cerveza {
	
	private String tipo, marca;
	private double porcentajeAlcohol;
	private Ingredientes ing;
	private Caracteristicas car;
	
	Cerveza(){
		
	}

	public Cerveza(String tipo, String marca, double porcentajeAlcohol, Ingredientes ing, Caracteristicas car) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.porcentajeAlcohol = porcentajeAlcohol;
		this.ing = ing;
		this.car = car;
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

	public double getPorcentajeAlcohol() {
		return porcentajeAlcohol;
	}

	public void setPorcentajeAlcohol(double porcentajeAlcohol) {
		this.porcentajeAlcohol = porcentajeAlcohol;
	}

	public Ingredientes getIng() {
		return ing;
	}

	public void setIng(Ingredientes ing) {
		this.ing = ing;
	}

	public Caracteristicas getCar() {
		return car;
	}

	public void setCar(Caracteristicas car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Cerveza [tipo=" + tipo + ", marca=" + marca + ", porcentajeAlcohol=" + porcentajeAlcohol + ", ing="
				+ ing + ", car=" + car + "]";
	}
	
	
	
	

}
