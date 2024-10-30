package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Expresiones Lambda son funciones "anonimas"
		 * que implementasn el metodo de una interface
		 * funcional
		 * lo cual nos permite escribir el metodo
		 * para su uso inmediato
		 * 
		 * el operador de las expresiones lamda es ->
		 * su sintaxis es (parametros)->{Cuerpo de lambda}
		 * 
		 * 
		 * Ejemplo de definicion de metodo con el uso de 
		 * expresion Lambda
		 * 
		 */
		IMetodo calculadora = (a, b) -> System.out.println(a+b);
		/*
		 * Una vez definido, procedemos a probarlo a travez del 
		 * "objeto" calculadora
		 */
		calculadora.operar(5, 11);
		
		/*
		 * Declarar una segunda calculadora
		 */
		IMetodo calculadora2 = (x, y) -> System.out.println(x-y);
		calculadora2.operar(15, 4);
		
		
		/*
		 * PODEMOS CREAR UNA INSTANCIA DE UNA INTERFACE?
		 * NO. PERO PODEMOS CREAR UNA INSTANCIA DE UNA CLASE ANONIMA
		 * QUE NOS PERMITA IMPLEMENTAR DICHA INTERFACE
		 */
		
		
		

	}

}
