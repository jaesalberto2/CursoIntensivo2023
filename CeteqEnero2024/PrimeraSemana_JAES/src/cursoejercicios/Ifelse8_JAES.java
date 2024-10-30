/*
 * 8. Realiza un programa que pida por teclado el resultado 
 * (dato entero) obtenido al lanzar un dado de
seis caras y muestre por pantalla el número en letras (dato cadena)
 de la cara opuesta al resultado
obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están los 
números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que
 6, se mostrará el mensaje:
“ERROR: número incorrecto”.
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse8_JAES {

	public static void main(String[] args) {
		// Declaracion d variables
		int resultado;
		Scanner ent= new Scanner(System.in);
		String res[]= {"Seis","Cinco","Cuatro","Tres","dos","uno"};
		//Entrada de datos
		
		System.out.println("Ingrese el resultado de lanzar el dado: ");
		resultado = ent.nextInt();
		
		//Estructura del programa
		if(resultado > 0 && resultado < 7) {
			System.out.println("El lado opuesto es "+res[(resultado-1)]);
		}else System.out.println("ERROR: numero incorrecto");

	}

}
