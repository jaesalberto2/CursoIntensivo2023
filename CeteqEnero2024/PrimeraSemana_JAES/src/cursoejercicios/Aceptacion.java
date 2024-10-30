package cursoejercicios;

import java.util.Scanner;

public class Aceptacion {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int edad=0;
		double nota=0;
		String sexo;
		System.out.println("ingrese la edad del candidato: ");
		edad = ent.nextInt();
		System.out.println("ingrese la nota del candidato: ");
		nota = ent.nextDouble();
		System.out.println("ingrese el sexo del candidato (M para masculino F para femenino): ");
		sexo = ent.nextLine();
		
		if(edad>=18 && nota>=5) {
			if(sexo.toLowerCase()=="m") {
				System.out.println("POSIBLE");
			}
		}

	}

}
