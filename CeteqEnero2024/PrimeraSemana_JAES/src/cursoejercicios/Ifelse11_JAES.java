/*
 * 11. Una compañía de transporte internacional tiene servicio 
 * en algunos países de América del Norte, América
Central, América del Sur, Europa y Asia. El costo por servicio 
de transporte se basa en el peso del paquete y
la zona a la que va dirigida. Lo anterior se muestra en 
la siguiente tabla:
ZONA UBICACIÓN COSTO/KILOGRAMO
1 América del Norte 24,00 euros
2 América Central 20, 00 euros
3 América del Sur 21,00 euros
4 Europa 10,00 euros
5 Asia 18,00 euros
Parte de su política implica que los paquetes con un peso
 superior a 5kg no son transportados, por
cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega
 de un paquete o, en su caso, el rechazo
de la entrega.
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse11_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int zona=0,peso=0,resultado=0;
		int zonalist[]= {24,20,21,10,18};
		Scanner ent = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("_____________________________________________________"
				+ "\nDe acuerdo con la siguiente tabla ingrese la zona(1-5)"
				+ "\n_____________________________________________________"
				+ "\n\n"
				+ "1.-America del norte"
				+ "\n2.-America central"
				+ "\n3.-America del sur"
				+ "\n4.-Europa"
				+ "\n5.-Asia");
		zona = ent.nextInt();
		System.out.println("_____________________________________________"
				+ "\nIngrese el peso del paquete:"
				+ "\n_____________________________________");
		peso = ent.nextInt();
		
		if(peso > 0 && peso <= 5 && zona <= 5 && zona > 0) {
			resultado = (zonalist[zona-1])*peso;
			System.out.println("El precio de su envio es: "+resultado+""
					+ "\nEl precio por kilogramo es: "+zonalist[zona-1]);
		}else System.out.println("ERROR!! Datos incorrectos");
		

	}

}
