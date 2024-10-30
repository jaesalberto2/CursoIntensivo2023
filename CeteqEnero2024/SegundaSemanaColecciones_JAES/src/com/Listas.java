package com;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Listas {

	public static void main(String[] args) {
		String cadena="";
		// Una lista es una coleccion o conjunto
		/*
		 * de elementos que admite elementos duplicados
		 * se implementa a travez de la clase ArrayList
		 * se basa en un array redimensionable
		 * es de las que mejor rendimiento tiene
		 * sobre la mayoria de situaciones
		 * 
		 * puede almacenar un tipo de datos en comun
		 * incluyendo objetos
		 * 
		 * Ejemplo de como declarar una lista de elementos
		 * String
		 * Estas colecciones se encuentran en el paquete java.util
		 * por lo que hay que importarlas
		 */
		
		List<String> lista = new ArrayList<String>();
		
		//Ejemplo de una lista con elementos de tipo entero
		//Las listas solo admiten tipos de datos estructurados (Objeto)
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		
		//Agregar valores a una lista
		
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//Visualizar el conjunto de elementos de mi lista
		JOptionPane.showConfirmDialog(null, lista);
		//Si quiero mostrar un elemento especifico en consola
		JOptionPane.showConfirmDialog(null, lista.get(3));
		
		//.contains() - Devuelve true si el elemento existe en la lista
		JOptionPane.showConfirmDialog(null, lista.contains("Rafael"));
		
		//.indexOf - Devuelve la posicion en la que encuentra por primera
		//vez al elemento
		JOptionPane.showConfirmDialog(null, lista.indexOf("Elias"));
		
		/*
		 * .lastIndexOf - Devuelve el indice donde se encuentra al 
		 * elemento la ultima vez
		 */
		
		JOptionPane.showConfirmDialog(null, lista.lastIndexOf("Elias"));
		
		/*
		 * .remove() -  elimina al elemento mediante la posicion
		 * o el objeto
		 */

		lista.remove(3);
		JOptionPane.showConfirmDialog(null, lista);
		
		lista.remove(3);
		JOptionPane.showConfirmDialog(null, lista);
		/*
		 * Conforme vamos eliminando elementios, los valores del indice
		 * se van desplazando, siendo ocupados por los otros elementos
		 * 
		 * si yo quiero agregar un nuevo elemento en la posicion 3
		 * el elemento que ocupa esa posicion va a ser desplazado 
		 * a la siguiente mas no eliminado o remplazado
		 */
		lista.add(3,"Enrique");
		JOptionPane.showConfirmDialog(null, lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(4, "Alexis");
		JOptionPane.showConfirmDialog(null, lista);
		
		//Mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			
			cadena += lista.get(i)+"\n";
			
		}

			JOptionPane.showConfirmDialog(null, cadena);
			
			//Podemos declarar una lista sin parametrizar
			List<Object> elementos = new ArrayList<Object>();
			elementos.add("Alex");
			elementos.add(1200.59);
			elementos.add(true);
			
			JOptionPane.showConfirmDialog(null, elementos);
			
			

	}

}
