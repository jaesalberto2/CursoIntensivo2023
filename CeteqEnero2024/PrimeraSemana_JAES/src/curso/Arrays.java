package curso;

public class Arrays {

	public static void main(String[] args) {
		/*
		 * los arrays son una estructura que nos permite 
		 * almacenar un conjunto de datos de un tipo en comun
		 * 
		 * la desventaja de los arrays es que estos no pueden crecer
		 * en tiempo de ejecucion
		 * 
		 * Declarar un array de numeros enteros
		 */
		
		int[] numeros;//declarado sin un tamaño y datos asignados
		// declarar el array con un tamaño iniciado
		int[] numeros2= new int[3];
		//asignamos los valores a guardar en cada posicion del array
		//las posiciones del array inician desde el indice "0"
		numeros2[0]=1;
		numeros2[1]=2;
		numeros2[2]=3;
		
		//Ejemplo de un array de String
		String[]nombres=new String[3];
		nombres[0]="Alex";
		nombres[1]="Nestor";
		nombres[2]="Ana";
		//nombres[3]="Lex"
		//ejemplo de impresion en cosola de un determinado nombre del array
		System.out.println(nombres[1]);
		
		
		//Ejemplo de declarar un array con letras ya guardadas en el
		char[]letras= {'A','l','e','x'};
		/*
		 * para poder imprimir cada uno de los calores de nuestro arreglo
		 * de numeros enteros recuerden que ya conocemos los siclos
		 * podemos emplear un ciclo for
		 */
		for(int i=0; i<numeros2.length;i++){
			System.out.println(numeros2[i]);
		}
	}

}
