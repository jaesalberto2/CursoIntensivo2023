package cursoejercicios;

import java.util.Scanner;

public class Aceptacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int edad=0;
		int nota=0;
		String sexo="";
		System.out.println("ingrese la edad del candidato: ");
		edad = entrada.nextInt();
		System.out.println("ingrese la nota del candidato: ");
		nota = entrada.nextInt();
		System.out.println("ingrese el sexo del candidato \n(M para masculino F para femenino): ");
		sexo = entrada.next();
		
		sexo = sexo.toLowerCase();
		
		if(edad>=18 && nota>=5) {
			if(sexo.equalsIgnoreCase("m")){ 
				System.out.println("POSIBLE");
				}
			else if(sexo.equalsIgnoreCase("f")) {
				System.out.println("ACEPTADO");
			}
		}else System.out.println("RECHAZADO");

	}

}
