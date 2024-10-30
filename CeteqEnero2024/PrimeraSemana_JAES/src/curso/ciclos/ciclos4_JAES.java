/*
 * 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
horas
 */
package curso.ciclos;

public class ciclos4_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		int hora=0,min=0,seg=0;
		do {
			do {
				do {
					System.out.println(hora+":"+min+":"+seg);
					seg++;
				}while(seg<=59);
					min++;
					seg=0;
			}while(min<=59);
			hora++;
			min=0;
			
		}while(hora<=23);

	}

}
