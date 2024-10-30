/*
 * 13. Una institución benéfica recibe anualmente una donación 
 * proveniente de Europa y lo reparte entre un 
centro de salud, un comedor de niños y una parte lo invierte 
en la bolsa de acuerdo a lo siguiente:
Si el monto de la donación es de $10000 o más: 30% se destina 
al centro de salud, 50% al comedor de niños 
y el resto se invierte en la bolsa.
Si el monto de la donación es menor que $10000: 25% se destina 
al centro de salud, 60% al comedor de 
niños y el resto se invierte en la bolsa.
La institución desea saber cuánto de dinero destinará a cada 
rubro anualmente.
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse13_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		double dinero=0;
		Scanner ent = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese el monto de la donacion: ");
		dinero = ent.nextDouble();
		
		//Desarrollo
		if(dinero>=10000) {
		System.out.println("Se destinara para lo siguiente:"
				+ "\n"+(dinero*0.3)+"\t Para el centro de salud"
						+ "\n"+(dinero*0.5)+"\t Para el comedor de niños"
								+ "\n"+(dinero*0.2)+"\t Para invertir en la bolsa");
		}else {System.out.println("Se destinara para lo siguiente:"
				+ "\n"+(dinero*0.25)+"\t Para el centro de salud"
				+ "\n"+(dinero*0.6)+"\t Para el comedor de niños"
						+ "\n"+(dinero*0.15)+"\t Para invertir en la bolsa");}
		}

	}


