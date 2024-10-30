package com;

import javax.swing.JOptionPane;

//LA HERENCIA se realiza con la palabra reservada extends
public abstract class Empleado extends Persona{
	
	//Esta va a ser una clase hija que heredara
	//los atributos de la clase persona
	
	private String rfc, puesto,turno;
	private double Salario;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, String turno, double salario) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.turno = turno;
		Salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", turno=" + turno + ", Salario=" + Salario
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	//METODOS PROPIOS DE LA CLASE EMPLEADO
	
		public void checarEntrada() {
		JOptionPane.showConfirmDialog(null, "Iniciando turno...");
			
		}
		
		/*
		 * METODO ABSTRACTO ES AQUEL QUE DEFINE QUE SE HACE
		 * PERO NO COMO SE HACE
		 */
	
		public abstract void vender();
	

}
