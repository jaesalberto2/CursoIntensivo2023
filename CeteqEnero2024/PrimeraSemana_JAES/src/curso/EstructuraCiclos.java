package curso;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// CICLOS  o tambien llamados bucles
		/*
		 * nos ayudan a ejecutar "n" vecs una accion
		 * de acuerdo a una condicion o condiciones
		 * 
		 * 
		 * casi siempre para realizar la accion varias veces 
		 * para ello nos vamos a apoyar en una variable numerica 
		 * ya que de acuerdo al cambio del valor de la misma
		 * es como se repetira la accion o bloque de codigo
		 * 
		 * 
		 * WHILE (mientras se cumpla una condicion)
		 */
		
		int x = 1;
//		while(x<5) {//mientras esta condicion se cumpla ejecutamos 
//			//lo de aquí adentro
//			System.out.println("Hola mundo " + x);
//			//puedo determinar el ciclo while
//			//indicando un incremento en la variable
//			x += 1;
//		}
		
		/*
		 * do-while- similar al ciclo while, pero si por alguna razon
		 * podemos encontrarnos con una condicion que no se cumpla 
		 * nos aseguramos de que nuestro programa se ejecute por lo menos 
		 * 1 vez
		 */
		
//		do {
//			System.out.println("Hola mundo");
//		}while(x>2); //MIENTRAS ESTO SE CUMPLA(evaluamos si la accion se realiza de nuevo)
//		
		/*
		 * FOR ciclo determinado para un conjunto de "condiciones"
		 * se utiliza mas cuando tenemos una idea de cuantas veces queremos
		 * que se realice una accion
		 * 
		 * PARA (estas condiciones){
		 * ejecutamos este bloque
		 * }
		 * 
		 * PARA
		 * 
		 *para (variable de control;condicion;incremento)
		 
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola mundo " + i);
		}
		

	}

}
