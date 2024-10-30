package curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFRW {

	public static void main(String[] args) {
		
		
		// Uso de las clases File, FileReader y BufferedReader
		/*
		 * vamos a declarar primero un String donde almacenar
		 * la linea o lines de texto por leer
		 */
		String linea;
		
		/*
		 *Muchas veces, cuando intentamos recuperar info
		 * de un archivo externo o conversion de datos
		 * que pueda tener algun "error" de comunicacion
		 * recurriremos a la estructura try & catch
		 */
		
		try {//Intentaremos ejecutar el siguiente codigo
			//Clase File - Representar el archivo en memoria
			File archivo = new File("C:\\Users\\ALBERTO\\Desktop\\fichero.txt");
			
			//FileReader - Permite abrir el archivo en modo lectura
			FileReader fr = new FileReader(archivo);
			
			//BuferedReader - Puede leer el contenido del archivo
			BufferedReader buffer = new BufferedReader(fr);
			
			//Asignamos las lineas de texto en el archivo a nuestro
			//String declarado previamente
			//para que mientras haya lineas por leer estas se visualicen
			while((linea = buffer.readLine()) != null) {
				
			
			System.out.println(linea);
			}
			
		} catch (Exception e) {//si algo ocurre, se atrapa aqui
			//y ejecutamos lo siguiente
			System.out.println("No se pudo encontrar el archivo");
			//Si queremos ver el error, imprimirmos el mismo donde 
			//se guardo en el objeto "e"
			e.printStackTrace();
		}
		
		
	}

}
