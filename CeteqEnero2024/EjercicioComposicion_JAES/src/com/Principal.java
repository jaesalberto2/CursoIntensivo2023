package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caracteristicas caract = new Caracteristicas("Dulce", "Claro", "Suave");

		Ingredientes ingr = new Ingredientes("Cebada", "Malta", "Lupulo");
		
		Cerveza cerveza1 = new Cerveza("Ippa", "Heineken", 4.0, ingr, caract);
		
		System.out.println(cerveza1);
	}

}
