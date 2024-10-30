/*
 * 1. Crea un array de 10 posiciones de números con valores
 *  pedidos por teclado.
Muestra por consola el índice y el valor al que corresponde.

 */
package curso.arrays;

import java.util.Scanner;

public class Arrays1_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=0;
		int numeros[];
		numeros = new int[10];
		Scanner ent = new Scanner(System.in);
		
		//entrada de datos
		do {
			System.out.println("Ingresa el valor de la posición "+i);
			numeros[i] = ent.nextInt();
			i++;
		}while(i<10);
		
		//Impresion de los resultados
		i=0;
		System.out.println("INDICE\t\tVALOR"
				+ "\n_________________________");
		do {
			System.out.println(i+"\t\t"+numeros[i]);
			i++;
		}while(i<10);

	}

}
