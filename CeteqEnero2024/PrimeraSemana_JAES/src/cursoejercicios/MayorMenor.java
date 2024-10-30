package cursoejercicios;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		num1= entrada.nextInt();
		System.out.println("Ingrese otro numero:");
		num2= entrada.nextInt();
		if(num1<num2){
			System.out.println(num2+" es mayor a "+num1);
		}
		else if(num2<num1) {
			System.out.println(num1+" es mayor a "+num2);
		}
		else
			System.out.println(num1+" es igual a "+num2);
			
	}

}
