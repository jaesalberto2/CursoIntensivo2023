package com;

public class Perro {
	private String raza, color;
	private double tama�o;
	
	Perro(){
		
	}

	public Perro(String raza, String color, double tama�o) {
		super();
		this.raza = raza;
		this.color = color;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	
	

}
