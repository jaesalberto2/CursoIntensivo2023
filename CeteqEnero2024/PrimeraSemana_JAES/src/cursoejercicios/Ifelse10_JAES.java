/*
 * 10.Realiza un programa que pida un número entero entre uno y doce 
 * e imprima el número de días que tiene el
mes correspondiente.

 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse10_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int mes = 0;
		String mesletra[]= {"Enero","Febrero","Marzo",""
				+ "Abril","Mayo","Junio","Julio","Agosto","Septiembre",""
						+ "Octubre","Noviembre","Diciembre"};
		Scanner ent = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese el mes en numero(1-12): ");
		mes = ent.nextInt();
		
		//Estructura del programa
		
		if(mes >= 1 && mes <= 12) {
			System.out.println("El mes correspondiente es: "+mesletra[mes-1]);
		}else System.out.println("Error!! mes incorrecto");
		

	}

}
