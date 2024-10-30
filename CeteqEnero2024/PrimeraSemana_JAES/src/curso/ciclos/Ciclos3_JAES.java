/*
 * 3. Realiza un programa para determinar si un String es palíndromo.
 */
package curso.ciclos;

import java.util.Scanner;

public class Ciclos3_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		String cadena="",cadena2="";
		Scanner ent = new Scanner(System.in);
		int i=1;
		System.out.println("Ingresa una frase para ver si es palindromo: ");
		cadena=ent.nextLine();
		do {//escribe la palabra al reves
			cadena2+=cadena.charAt(cadena.length()-i);
			i++;
			
		}while(i<cadena.length()+1);
		
		if(cadena.equalsIgnoreCase(cadena2)) {//compara palabra con palabra al reves
			System.out.println(cadena+" ES UN PALINDROMO");
		}else
			System.out.println(cadena+" NO ES UN PALINDROMO");

	}

}
