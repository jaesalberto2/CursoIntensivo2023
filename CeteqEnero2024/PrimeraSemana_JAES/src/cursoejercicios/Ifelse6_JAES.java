/*
 * . La asociación de vinicultores tiene como política fijar un precio
 *  inicial al kilo de uva, la cual se 
clasifica en tipos (A y B), y además en tamaños (1 y 2). 
Cuando se realiza la venta del producto, ésta 
es de un sólo tipo y tamaño, se requiere determinar cuánto 
recibirá un productor por la uva que 
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 céntimos al precio inicial
*  cuando es de tamaño 1 y 30 céntimos si 
es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño
*  1, y 50 céntimos cuando es de 
tamaño 2.
Precio inicial se recibe desde teclado
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelse6_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		double price=0.0,profit=0;
		int size=0,mass=0;
		String type="";
		Scanner ent = new Scanner(System.in);
		
		//entrada de datos
		System.out.println("Ingrese el tipo de uva (A o B): ");
		type = ent.nextLine();
		System.out.println("Ingrese el tamaño (1 o 2): ");
		size = ent.nextInt();
		System.out.println("Ingrese el precio (En euros): ");
		price = ent.nextDouble();
		System.out.println("Ingrese la cantidad de kilogramos");
		mass = ent.nextInt();
		
		//verificacion de datos
		if(type.equalsIgnoreCase("a")){
			if(size==1) {
				profit = (price-0.20)*mass;
			}
			if(size==2) {
				profit = (price-0.30)*mass;
			}
		}
		if(type.equalsIgnoreCase("b")){
			if(size==1) {
				profit = (price-0.30)*mass;
			}
			if(size==2) {
				profit = (price-0.50)*mass;
			}
		}
		
	
		
		//Impresion en pantalla
		System.out.println("La ganancia es: "+profit);
	}

}
