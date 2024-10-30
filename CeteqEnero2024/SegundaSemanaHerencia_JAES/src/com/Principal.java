package com;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejemplo de instanciar una nueva persona
		
		Persona persona1 = new Persona("Valeria", "Femenino", 25);
				
		//Ejemplo de instanciar un nuevo empleado
		//Una vez volvemos Empleado como clase Abstracta no 
		//no podemos crear instancias de las mismas
		//Empleado desarrollador = new Empleado("Alex", "Masculino", 24, "ALX33", "Java JR", "Matutino", 25000);
		
		//System.out.println(persona1);
		//System.out.println(desarrollador);
		
		//JOptionPane.showConfirmDialog(null, persona1+"\n"+desarrollador);
		
		//EJERCICIO, REALIZAR UN EJEMPLO DE HERENCIA
		//POR EJEMPLO UNA CLASE ANIMAL,QUE HERED A OTR CLASE, POR EJ PERRO
		Perro perro1 = new Perro("doberman", "negro", 1.2);
		
		Animal animal1= new Animal("chihuahua", "cafe", 0.3, "domestico", "7", true);
		
		JOptionPane.showConfirmDialog(null, perro1+"\n"+animal1);
		
		/*
		 * probar el metodod comer de nuestra persona
		 * 
		 */
		persona1.comer();
		
		
		JOptionPane.showConfirmDialog(null, persona1.respirar());
		
		//probando el metodo polimorfico comer
		persona1.comer("Pizza");
		
		persona1.comer("pollo", 4);
		
		//VAMOS A REVISAR QUE LOS METODOS TAMBIEN SON HEREDADOS
		//JOptionPane.showConfirmDialog(null, desarrollador.respirar());
		
		
		/*
		 * EJEMPLO DE INSTANCIAR UN VENDEDOR, QUE ES UN OBJETO
		 *  DE UNA CLASE NIETA
		 */
		
		Vendedor liverpool =new Vendedor();
		liverpool.comer("tacos", 4);
		
		liverpool.checarEntrada();
		
		liverpool.vender();
	}
	

}
