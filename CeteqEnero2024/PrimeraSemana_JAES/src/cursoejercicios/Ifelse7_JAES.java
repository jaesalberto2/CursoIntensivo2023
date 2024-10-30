/*
 * 7. El director de una escuela está organizando un viaje de estudios
 *  y requiere determinar cuánto
debe cobrar a cada alumno y cuánto debe pagar a la compañía
 de viajes por el servicio. La forma de
cobrar es la siguiente:
* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autobús es 
* de 4000 euros, sin importar el número de
alumnos.
Realiza un algoritmo que permita determinar el pago a la compañía
 de autobuses y lo que debe
pagar cada alumno por el viaje.
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse7_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int nalumnos=0,precio1=65,precio2=70,precio3=95, precio4=4000;
		Scanner ent =new Scanner(System.in);
		//Entrada de datos
		System.out.println("Ingrese la cantidad de alumnos que irán al viaje:");
		nalumnos= ent.nextInt();
		
		//Estructura del programa
		if (nalumnos>=100) {
			System.out.println("El precio total es: "+(nalumnos*precio1)+"\n "
					+ "El precio por alumno es: "+precio1);
		}else if (nalumnos<100&&nalumnos>=50) {
			System.out.println("El precio total es: "+(nalumnos*precio2)+"\n "
					+ "El precio por alumno es: "+precio2);
		}
		else if (nalumnos<50&&nalumnos>30){
			System.out.println("El precio total es: "+(nalumnos*precio3)+"\n "
					+ "El precio por alumno es: "+precio3);
		}
		else if (nalumnos<30) {
			System.out.println("El precio total es: "+(precio4));
			}
	}

}
