/*
 * 9.Realiza un programa que pida el día de la semana (del 1 al 7) 
 * y escriba el día correspondiente. Si
introducimos otro número nos da un error.
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse9_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int dia=0;
		String dialetra[]= {"lunes","Martes","Miercoles",""
				+ "Jueves","Viernes","Sabado","Domingo"};
		Scanner ent =new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese el dia de la semana en numero(1-7):");
		dia= ent.nextInt();
		
		
		//Estructura del programa
		if(dia>=1&&dia<=7) {
			System.out.println("El dia que elegiste es: "+dialetra[(dia-1)]);
		}else System.out.println("ERROR dia incorrecto");
		
	}

}
