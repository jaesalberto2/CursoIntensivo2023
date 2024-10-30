package com;

import javax.swing.JOptionPane;

public abstract class Calculadora {
	String marca, color, modelo;
	
	private Calculadora() {
		
	}

	public Calculadora(String marca, String color, String modelo) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	
	public void sumar() {
		int x,y;
		x= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		y= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		JOptionPane.showConfirmDialog(null, "La suma de "+x+" + "+y+" es igual a "+(x+y), "Suma", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void restar() {
		int x,y;
		x= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		y= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		JOptionPane.showConfirmDialog(null, "La resta de "+x+" - "+y+" es igual a "+(x-y), "Resta", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void division() {
		int x,y;
		x= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		y= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		JOptionPane.showConfirmDialog(null, "La division de "+x+" / "+y+" es igual a "+(x/y), "Division", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	public void multiplicacion() {
		int x,y;
		x= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		y= Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
		JOptionPane.showConfirmDialog(null, "La multiplicacion de "+x+" x "+y+" es igual a "+(x*y), "Multiplicacion", JOptionPane.INFORMATION_MESSAGE);
		
	}
	public abstract void iniciarCalculadora();

}
