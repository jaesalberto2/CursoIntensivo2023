package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO, solo  debe existir una clase 
		//con el metodo principal

		//ya que aqui llamaremos posteriormente a los objetos
		//que tendran sus propias acciones
		
		//aqui ya puedo crear una variable de la clase
		//persona. La creacion de esta variable se le conoce como
		//"instancia" u objeto en si
		Persona persona1 = new Persona();
		
		//Si quiero puedo asignarle un nombre a persona1
		//persona1.nombre = "Carlos"<-- forma  incorrecta de 
		//asignar valores a un objeto
		
		/*
		 * Instanciando una persona con el constructor con todos
		 * los parametros
		 */
		Persona persona2 = new Persona("Daniel", 25, "Mexicana", 1.8, 70);
		Persona persona3 = new Persona("Ana");
		
		//Probando el metodo getNombre en la persona3
		System.out.println(persona3.getNombre());
		System.out.println(persona3.getEdad());
		
		//Probando el metodo setNombre en persona1 que esta vacio
		persona1.setNombre("Carlos");
		persona1.setNacionalidad("Ingles");
		
		System.out.println(persona1.getNacionalidad());
		
		//Imprimir los atributos completos de mi objeto en consola
		System.out.println(persona2);
		
		Torta salchicha = new Torta();
		Torta cubana = new Torta("Cubana", "Trigo", "Milanesa", 50, 350);
		System.out.println(cubana);
		
		
		
		
		//Modelar un objeto el que ustedes gusten 
		//con 5 atributos por lo menos
		//crear constructor vacio, constructor con todos los parametros
		/*
		 * getters y Setters
		 * Metodo toString
		 * 
		 * y aqui en esta clase principal, instancia o crean uno vacio
		 * uno con todos los parametros 
		 * y los mandan a imprimir en consola
		 */
		
		Computadora com1 = new Computadora();
		Computadora com2 = new Computadora("Dell", "I7", 512, 64, 2024);
		
		System.out.println(com2);
		System.out.println(com1);
		
	}

}
