package com;

import javax.swing.JOptionPane;

public class Persona {
	
	//Esta clase va a ser nuestra clase Padre o superclase
	
	
	private String nombre, genero;
	private int edad;
	
	Persona(){
		
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	//METODOS PROPIOS O COMPORTAMIENTOS DE LOS OBJETOS
		/*
		 * Son acciones que nuestro objeto puede llevar a cabo
		 * 
		 * 
		 * METODO VOID -Metodo que ejecuta algo, pero no debe
		 * retornar algun valor de un tipo de dato
		 * 
		 * Ejemplo, crear un metodo para que una persona pueda comer
		 * 
		 */
	
	public void comer() {
		//aqui definiremos la accion del mismo
		
		JOptionPane.showConfirmDialog(null, "Estoy comiendo...");
	}
	
	/*
	 * METODO CON RETORNO DE TIPO DE DATO
	 */
	public String respirar() {
		String oxigeno = "Estoy respirando";
		return oxigeno;
	}
	public void comer(String comida) {
		JOptionPane.showConfirmDialog(null, "Estoy comiendo "+comida);
		
		//creando un metodo mas de comer
		
		
		
	}
	
	public void comer(String comida, int cantidad) {
		JOptionPane.showConfirmDialog(null, "Estoy comiendo "+cantidad+" raciones de "+comida);
	}

	/*
	 * POLIMORFISMO DEL METODO ES CUANDO TENEMOS VARIAS FORMAS DEL
	 *  METODO CON EL MISMO NOMBRE, LO CUAL SE CONOCE COMO 
	 *  SOBRECARGA DE ARGUMENTOS, ES DECIR, LOS DATOS
	 *  QUE EL METODO SOLICITE PARA EJECUTARSE
	 */
	
}
