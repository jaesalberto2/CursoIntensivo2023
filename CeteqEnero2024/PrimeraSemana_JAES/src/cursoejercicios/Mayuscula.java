package cursoejercicios;

import java.util.Scanner;

public class Mayuscula {

	public static void main(String[] args) {
		
	String cadena="";
	Scanner ent= new Scanner(System.in);
	System.out.println("Ingresa una letra: ");
	cadena = ent.next();
	if(cadena==cadena.toUpperCase()) {
		System.out.println(cadena+" Está en Mayusculas");
	}else
		System.out.println(cadena+" Está en Minusculas");
	

	}

}
