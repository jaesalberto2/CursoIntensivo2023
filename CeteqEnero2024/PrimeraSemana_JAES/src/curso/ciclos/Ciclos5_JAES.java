/*
 * 5. Una persona desea invertir $1000.00 en un banco, el cual le 
 * otorga un 2% 
de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
tendr� al cabo de un a�o si todo el dinero lo reinvierte?
 */
package curso.ciclos;

public class Ciclos5_JAES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		double inversion=1000;
		do {
			inversion=inversion*1.02;
			i++;
		}while(i<=12);
		System.out.println("La cantidad que tiene al final es: "+inversion);

	}

}
