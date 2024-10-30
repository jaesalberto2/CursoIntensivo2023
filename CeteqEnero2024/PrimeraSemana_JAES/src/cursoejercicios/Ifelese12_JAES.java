/*
 * 12.Construir un programa que calcule el índice de masa corporal
 *  de una persona (IMC = peso [kg] / altura2 
[m]) e indique el estado en el que se encuentra esa
 persona en función del valor de IMC:
Nota 1: se recomienda el empleo de sentencias if–else anidadas.
 Nota 2: Los operandos (peso y altura) deben 
ser introducidos por teclado por el usuario.
 */
package cursoejercicios;

import java.util.Scanner;

public class Ifelese12_JAES {

	public static void main(String[] args) {
		// Declaracion de variables
		double peso=0,altura=0,imc=0;
		Scanner ent = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Ingrese la altura de la persona(Metros): ");
		altura = ent.nextDouble();
		System.out.println("Ingrese el peso de la persona(Kilogramos): ");
		peso = ent.nextDouble();
		
		//calculo IMC
		imc=peso/(Math.pow(peso, 2));
		
		//comparar resultados
	
		if(imc<16)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nCriterio de ingreso al hospital");
		}else if(imc >= 16 && imc < 17)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nInfrapeso");
		}else if(imc >= 17 && imc < 18)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nBajo peso");
		}else if(imc >= 18 && imc < 25)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nPeso normal (Saludable)");
		}else if(imc >= 25 && imc < 30)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nSobrepeso (Obesidad de grado I)");
		}else if(imc >= 30 && imc < 35)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nSobrepeso cronico (Obesidad de grado II)");
		}else if(imc >= 35 && imc < 40)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nObesidad premorbida (Obesidad de grado III)");
		}else if(imc>40)
		{
			System.out.println("IMC = "+imc+" "
					+ "\nObesidad morbida (Obesidad de grado IV)");
		}
		

	}

}
