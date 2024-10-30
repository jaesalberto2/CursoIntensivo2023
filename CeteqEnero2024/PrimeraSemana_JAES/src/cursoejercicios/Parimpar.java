package cursoejercicios;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[] args) {
		int num=0;
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num = ent.nextInt();
		if(num%2==0) {
			System.out.println(num+" es un numero PAR");
		}else
			System.out.println(num+" es un numero IMPAR");

	}

}
