package cursoejercicios;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		double num1=0,num2=0;
		Scanner ent = new Scanner(System.in);
		System.out.println("ingrese un numero: ");
		num1 = ent.nextInt();
		System.out.println("ingrese otro numero: ");
		num2 = ent.nextInt();
		
		if(num2!=0) {
			System.out.println("La division de "+num1+" / "+num2+" es igual a "+(num1/num2));
		}else
		{
			System.out.println("ERROR!!! NO SE PUEDE DIVIDIR ENTRE 0");
		}
			

	}

}
