/*
 * 14. Un obrero necesita calcular su salario semanal, 
 * el cual se obtiene de la siguiente manera: Si trabaja 40 
horas o menos se le paga $16 por hora. Si trabaja más de 
40 horas se le paga $16 por cada una de las 
primeras 40 horas y $20 por cada hora extra
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse14_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int horas=0;
		Scanner ent = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese la cantidad de horas trabajadas: ");
		horas = ent.nextInt();
		
		//Desarrollo
		if(horas<=40)
		{
			System.out.println("su salario es: "+(horas*16));
		}else System.out.println("su salario es: "+(640+(horas-40)*20));
	}

}
