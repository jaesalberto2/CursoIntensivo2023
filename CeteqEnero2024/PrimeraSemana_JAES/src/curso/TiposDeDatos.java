package curso;//nombre del paquete

import javax.swing.JOptionPane;

public class TiposDeDatos {//nombre de la clase  y apertura

	public static void main(String[] args) {//apertura del main
		//el metodo principal es el punto de entrada y ejecucion
		//de un programa
		
		//comentarios de una sola linea
		//dos diagonales
		
		System.out.println("Hola mundo");
	
	/*
	 * comentarios 
	 * de 
	 * multiples 
	 * lineas
	 * 
	 * 
	 * ctrl + S para guardar cambios en el codigo
	 * 
	 * 
	 * Declaracion de tipos de datos
	 * tipos de metodos primitivos 
	 * 	NUMEROS ENTEROS 	
	 * 
	 * 
	 * declarar variables de los tipos de datos pero sin un valor
	 * asignado
	 * 
	 * 
	 */
		byte numero1;
		short numero2;
		int numero3;
		long numero4;
		
		//posteriormente puedo asignarles un valor si asi lo requiero
		numero1=127;
		
		//Declarar variables con tipo de dato y valor asignado
		//desde un inicio
		byte numero5 =-128; //1 BYTE
		short numero6 = 32767; //2BYTES
		int numero7 = 2147483647; //4 BYTES
		long numeros8 = 2147483648L; //8 BYTES
		//las variables de tipo long para almacenar 
		//rangos mas alla por los admitidos en los int 
		//necesitan el sufijo "L"
		
		//La variable "comodin" o mas utilizada para almacenar 
		//numeros en teros es la de tipo "int"
		
		float numero9 = 3.1416F;//los datos de tipo float necesitan el sufijo
		//"F" para contener el valor // 4 bytes
		
		double numero10 = 3.1416780909078; //8bytes de memoria y 
		//no necesita sufijo
		//la variable comodin mas utilizada es la de tipo "double"
		
		
		//TIPOS DE DATOS PRIMITIVOS
		/*
		 * BOOLEANOS Y DE TIPO CARACTER
		 */
		boolean evalua =true; //estos tipos de datos facilitan el trabajo
		//al evaluar condiciones o expreciones, solo admiten TRUE or FALSE
		char caracter = 'a';
		
		/*
		 * TIPOS DE DATOS NO PRIMITIVOS
		 * TIPOS DE DATO OBJETO/TIPOS DE DATO REFERENCIALES
		 * TIPOS DE DATO WRAPPER
		 * 
		 * Cuando estemos frente a un dato no primitivo
		 * lo identificaremos por que se trata de una clase
		 * es decir el nombre del tipo de dato comienza con 
		 * mayuscula
		 * 
		 * Cadena de texto o secuencia de caracteres
		 */
		String cadena = "Hola generación 159";
		String nombre = "Jose Alberto Escareño Sanchez";
		
		/*
		 * El tipo de datos  String admite secuencias de caracteres
		 * incluyendo simbolos, espacios, signos de puntuacion
		 * numeros etc
		 * sin embargo si almacenamos numeros en un tipo de dato 
		 * string, se almacena como texto y no como numero
		 */
		
		/*
		 * tipos de dato wrapper o envoltorio
		 * son tipos de datos que son clases, y por ese hecho van 
		 * a otorgarle otras funcionalidades o propiedades 
		 * a las variables declaradas
		 */
		byte x = 127;
		Byte by = 127;
		Short sh = 10000;
		
		/*
		 * si yo utilizo mi variable x que es un numero primitivo
		 * x. al agregarle un punto a la variable, no me permite realizar alguna
		 * otra accion
		 * 
		 * si yo utilizo mi variable by que es un tipo de dato wrapper 
		 * veamos que ocurre al poner un punto .delante del nombre
		 *
		 */
		
		by.toString();//Aqui este metodo me permite convertir el 
		//valor contenido en byte a cadena de texto
		/*
		 * Como darle salida en consola a nuestros datos
		 * para poder visualizarlos
		 * ejemplo imprimir en pantalla lo que contiene en 
		 * alguna variable,
		 * por ejemplo la variable nombre
		 */
		System.out.println(nombre);
		//atajo 
		//syso o sout + ctr + espacio
		System.out.println("Hola mundo");
		
		//concatenar unir valores para mostrarlos en una impresion
		
		System.out.println("Hola mundo mi nombre es "+ nombre);
		System.out.println("El resultado de la suma es "+(127+5));
	}//llave de cierre del mail
}//llave de cierre de la clase

