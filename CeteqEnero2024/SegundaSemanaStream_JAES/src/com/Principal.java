package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		/*
		 * API Stream - Funcionalidad a partir de JAVA 8
		 * Que nos va a permitir hacer un mejor uso de 
		 * los datos de una coleccion
		 * En una coleccion podemos contar con muchos datos 
		 * y al ponerlos en un "flujo"
		 * vamos a ser capaces de solicitarlos o gestionarlos de la
		 * forma que mejor nos convenga, ya sea filtrandolos,
		 * ordenandolos
		 * etc
		 * 
		 * Vamos a crear una lista de personas y vamos a 
		 * añadir elementos
		 * 
		 */
		List<Persona> alumnos = new ArrayList<Persona>(); 
		
		/*
		 * Creamos otra lista donde coleccionaremos los elementos
		 * filtrados de acuerdo a nuestros criterios
		 */
		List<Persona> filtrada = new ArrayList<Persona>();
		/*
		 * Añadimos elementos a nuestra lista original (Alumnos)
		 */
		alumnos.add(new Persona("Alberto",30,"MASCULINO"));
		alumnos.add(new Persona("Fernando",29,"MASCULINO"));
		alumnos.add(new Persona("Edwin",35,"MASCULINO"));
		alumnos.add(new Persona("Alfredo",28,"MASCULINO"));
		alumnos.add(new Persona("Daniel",28,"MASCULINO"));
		alumnos.add(new Persona("Roberto",26,"MASCULINO"));
		alumnos.add(new Persona("Alejandro",31,"MASCULINO"));
		alumnos.add(new Persona("Ana",25,"FEMENINO"));
		alumnos.add(new Persona("Valeria",25,"FEMENINO"));
		alumnos.add(new Persona("Judiel",32,"MASCULINO"));
		alumnos.add(new Persona("Omar",27,"MASCULINO"));
		
		/*
		 * Si quiero imprimir un solo valor  en cosola
		 */
		//System.out.println(alumnos.get(0));
		
		/*
		 * Si quiero imprimir todos los elementos recurrimos a un ciclo
		 * for
		 */
		
//		for (int i = 0; i < alumnos.size(); i++) {
//			System.out.println(alumnos.get(i));
//			
//		}
		
		/*
		 * Ciclo for each - Para cada elemento de nuestra
		 * coleccion
		 */
//		for(Persona i: alumnos) {
//			System.out.println(i);
//		}
		
		/*
		 * Ciclo for each a traves del metodo de la lista
		 */
		//alumnos.forEach(a -> System.out.println(a));
		
		/*
		 * Ejemplo de filtrar algun genero con un ciclo convencional
		 */
		
//		for(Persona i : alumnos) {
//			if(i.getGenero().equalsIgnoreCase("femenino")) {
//				filtrada.add(i);
//			}
//		}
//		filtrada.forEach(i-> System.out.println(i));
		
		/*
		 * Filtrar con el API Stream a las personas del genero Femenino
		 */
		
//		filtrada = alumnos.stream().filter(i -> i.getGenero().equalsIgnoreCase("femenino")).collect(Collectors.toList());
//		
//		filtrada.forEach(i-> System.out.println(i));
		
		/*Ordenar a las personas por edad ascendente
		 * 
		 */
		filtrada = alumnos.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		filtrada.forEach(i-> System.out.println(i));
		
		// contar los elementos que tenemos en una lista
		long cuantos = alumnos.stream().count();
		System.out.println(cuantos);
		
		/*
		 * allMatch
		 * anyMatch
		 * Optional<persona> La clase Optional lo que hace es tener
		 * la posibilidad de manejar valores nulos
		 */
		
		
		
		
	}

}
