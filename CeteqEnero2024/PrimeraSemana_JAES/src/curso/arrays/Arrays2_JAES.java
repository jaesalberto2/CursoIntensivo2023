/*
 * 2. Crea un array de n�meros de 100 posiciones, 
 * que contendr� los n�meros del
1 al 100. Obt�n la suma de todos ellos y la media.
 */
package curso.arrays;

import java.util.Scanner;

public class Arrays2_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=0,suma=0;
		int numeros[];
		numeros = new int[100];
		Scanner ent = new Scanner(System.in);
		
		do {
			numeros[i] = (i+1);
			i++;
		}while(i<100);
		
		//Calculo de la suma
		i=0;
		do {
		suma +=	numeros[i];
			i++;
		}while(i<100);
		
		//Impresion de los resultados
		System.out.println("La suma de los primeros 100 numeros es: "+suma+""
				+ "\nLa media de los primeros 100 numeros es: "+(suma/100));

	}

}
