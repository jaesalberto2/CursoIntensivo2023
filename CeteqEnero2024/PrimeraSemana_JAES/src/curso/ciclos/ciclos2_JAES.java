/*
 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
introducido desde teclado, hasta la iteración deseada por el usuario. 
Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
 */
package curso.ciclos;

import java.util.Scanner;

public class ciclos2_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=0,n=0,num=0;
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa el numero del que deseas la tabla: ");
		num = ent.nextInt();
		System.out.println("Ingresa la extension de la tabla: ");
		n = ent.nextInt();
		
		do {
			System.out.println(num+" x "+i+" = "+(num*i));
			i++;
		}while(i<=n);

	}

}
