package com;

public class Perro {
	private String raza, color;
	private double tamaño;
	
	Perro(){
		
	}

	public Perro(String raza, String color, double tamaño) {
		super();
		this.raza = raza;
		this.color = color;
		this.tamaño = tamaño;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
	

}
