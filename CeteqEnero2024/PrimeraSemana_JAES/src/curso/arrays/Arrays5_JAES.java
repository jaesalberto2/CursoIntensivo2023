/*
 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
respectivos precios. Muestra en consola la lista de productos y sus precios.
Por lo menos 5 productos o artículos.
 */
package curso.arrays;

public class Arrays5_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		String productos[] = {"Cafe	","Galletas","Chocolate","Piloncillo","Papas	"};
		Double precios[] = {15.0,18.0,8.0,23.0,25.0};
		int i=0;
		
		//Mostrar lista de productos y precios
		System.out.println("Numero\t\tProducto\t\tPrecio");
		do {
			System.out.println((i+1)+"\t\t"+productos[i]+"\t\t"+precios[i]);
			i++;
		}while(i<5);

	}

}
