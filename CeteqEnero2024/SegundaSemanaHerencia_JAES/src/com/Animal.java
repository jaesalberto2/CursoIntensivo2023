package com;

public class Animal extends Perro {
	
	private String tipo, edad;
	private boolean vacunas;
	
	Animal(){
		
	}

	public Animal(String raza, String color, double tamaño, String tipo, String edad, boolean vacunas) {
		super(raza, color, tamaño);
		this.tipo = tipo;
		this.edad = edad;
		this.vacunas = vacunas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public boolean isVacunas() {
		return vacunas;
	}

	public void setVacunas(boolean vacunas) {
		this.vacunas = vacunas;
	}

	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + ", edad=" + edad + ", vacunas=" + vacunas + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	

}
