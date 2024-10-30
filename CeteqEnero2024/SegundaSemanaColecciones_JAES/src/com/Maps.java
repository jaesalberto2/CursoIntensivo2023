package com;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Maps {

	public static void main(String[] args) {
		// La interfaz Map asocia claves a valores
		/*
		 * Esta interface no puede contener claves duplicadas(ID)
		 * pero si valores duplicados
		 * 
		 * Cada clave puede tener asociado un valor como maximo
		 * 
		 * HashMap: esta implementacion almacena las claves en una tabla 
		 * has. Es la que mejor rendimiento tiene en los maps, pero
		 * esto no garantiza un orden al momento de realizar las iteraciones
		 * 
		 * 
		 * declarando un hasmap 
		 * el primer valor es el tipo de dato que funcionará como 
		 * clave o llave (key)
		 * el segundo valor será el tipo de dato a almacenar en dicha
		 * clave
		 * Ejemplo, vamos a declarar un HashMap para guardar
		 * elementos de tipo String
		 * 1, "Adrian"
		 * 2, "Rafael"
		 * 3, "Miguel"
		 * 4, "Arasandi"
		 * 5, "Alexis" - Las llaves no pueden repetirse
		 */
		
		Map<Integer,String> usuarios = new HashMap<Integer, String>();
		
		//Agregar datos a mi HashMap
		
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		//Imprimir determinado valor
		
		JOptionPane.showConfirmDialog(null,usuarios.get(5));
		usuarios.put(5, "Arasandi");
		JOptionPane.showConfirmDialog(null,usuarios.get(5));
		
		//Declarar un HashMap con llaves String y guardar elementos
		//Double
		Map<String,Double> decimales = new HashMap<String,Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		JOptionPane.showConfirmDialog(null, decimales.get("B"));
		
		//Para remover un elemento  - .remove
		decimales.remove("B");
		
		

		
		

	}

}
