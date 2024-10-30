package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * cuando estamos ante un objeto de composicion
		 * primero debemos crear los que forman parte
		 * del mismo
		 */
		
		Almacenamiento disco = new Almacenamiento("kingston","SSD",480);
		
		//creamos memoria ram
		
		Memoria ram = new Memoria("ADATA", "DDR4", 16);
				
			//creamos nuestra nueva computadora
				
				Computadora laptop = new Computadora("Laptop", "HP", "440", disco, ram);

				//Imprimimos en consola nuestra laptop
				System.out.println(laptop);
				
				//CREAR UN OBJETO DE COMPOSICION
				//EJEMPLO- UNCELULAR QUE CUENTA CON MARCA,COLOR,PRECIO
				/*
				 * Y ADEMAS CON UNA CAMARA, PROCESADOR, ESTOS ULTIMOS
				 * SON OBJETOS QUE FORMAN PARTE DEL CELULAR, PERO TAMBIEN
				 * TIENEN SUS PROPIOS ATRIBUTOS
				 */
	}

}
