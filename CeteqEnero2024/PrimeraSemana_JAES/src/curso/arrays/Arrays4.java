/*
 * 4. Dado un array de números de 5 posiciones con los siguientes 
 * valores:
{1,2,3,4,5}. Guardar los valores de este array en otro array distinto
 pero con
los valores invertidos, es decir, que el segundo array deberá
 tener los valores
{5,4,3,2,1}.

 */
package curso.arrays;

public class Arrays4 {

	public static void main(String[] args) {
		// Declaracion de variables
		int i=0;
		int array1[]= {1,2,3,4,5};
		int array2[];
		array2 = new int[5];
		
		//copia de arrays
		do {
			array2[i]=array1[4-i];
			i++;
			}while(i<5);
		
		//Salida de datos
		i = 0;
		System.out.println("Indice\t\tArray 1\t\tarray 2"
				+ "\n_________________________________________");
		do {
			System.out.println( i+"\t\t"+array1[i]+"\t\t"+array2[i]);
			i++;
		}while(i<5);
		
		

	}

}
