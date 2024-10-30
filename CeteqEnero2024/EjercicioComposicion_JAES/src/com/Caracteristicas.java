package com;

public class Caracteristicas {
	
	private String olor, color, textura;
	
	Caracteristicas(){
		
	}

	public Caracteristicas(String olor, String color, String textura) {
		super();
		this.olor = olor;
		this.color = color;
		this.textura = textura;
	}

	public String getOlor() {
		return olor;
	}

	public void setOlor(String olor) {
		this.olor = olor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	@Override
	public String toString() {
		return "Caracteristicas [olor=" + olor + ", color=" + color + ", textura=" + textura + "]";
	}
	
	

}
