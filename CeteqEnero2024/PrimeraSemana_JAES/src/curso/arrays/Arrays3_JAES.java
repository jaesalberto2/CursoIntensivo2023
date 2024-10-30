/*
 * 3. Pide al usuario por teclado una frase y pasa sus caracteres 
 * a un array de
caracteres.
 */
package curso.arrays;

import java.util.Scanner;

public class Arrays3_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=0;
		String cadena="";
		char arraycadena[];
		arraycadena = new char[100];
		Scanner ent = new Scanner(System.in);
		
		//entrada de datos
		System.out.println("Ingrese una frase: ");
		cadena = ent.nextLine();
		
		//ingreso de caracteres al arreglo
		do {
			arraycadena[i]=cadena.charAt(i);
			i++;
		}while(i<cadena.length());
		
		
		System.out.println("Elige un indice del arreglo: ");
		i = ent.nextInt();
		System.out.println("El elemento "+i+" del arreglo es: "+arraycadena[i]);
		

	}

}
