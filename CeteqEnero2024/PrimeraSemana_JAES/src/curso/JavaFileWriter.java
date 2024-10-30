package curso;

import java.io.File;
import java.io.FileWriter;

public class JavaFileWriter {

	public static void main(String[] args) {
		
		// Uso de la clase FileWriter
		/*
		 * Para escribir informacion en un archivo
		 * 
		 * Declaramos una cadena de texto para pasarla
		 * como valor a nuestro archivo
		 */
		String texto ="\nPrueba Clase FileWriter";
		try {
			File archivo = new File("C:\\Users\\ALBERTO\\Desktop\\fichero.txt");
			// ya que tenemos identificado el archivo para escribir
			//hacemos uso de la clase FileWriter
			FileWriter line = new FileWriter(archivo, true);
			
			//Para que se respete el contenido del archivo, indico true
			//para que no lo sobreescriba, sino que añada la info unicamente
			
			//Procedemos a escribir 
			line.write(texto);
			//confirmamos el cambio o el guardado del archivo
			line.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
