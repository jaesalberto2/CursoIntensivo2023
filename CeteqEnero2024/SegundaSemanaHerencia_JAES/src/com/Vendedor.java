package com;

import javax.swing.JOptionPane;

public class Vendedor extends Empleado{
	
	private double comision;
	
	public Vendedor() {
		
	}

	public Vendedor(String nombre, String genero, int edad, String rfc, String puesto, String turno, double salario,
			double comision) {
		super(nombre, genero, edad, rfc, puesto, turno, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedor [comision=" + comision + ", toString()=" + super.toString() + "]";
	}

	/*
	 * LAS CLASES QUE HEREDAN UNA CLASE ABSTRACTA, TIENEN QUE 
	 * DEFINIR LOS METODOS ABSTRACTOS
	 */
	@Override
	public void vender() {
	
		JOptionPane.showConfirmDialog(null, "Vendiendo...");
		
	}

	
	

}
