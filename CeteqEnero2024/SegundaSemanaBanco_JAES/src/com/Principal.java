package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a iniciar con crear nuestro
		/*
		 * HashMap que contendrá  nuestras
		 * cuentas de banco
		 */
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		/*
		 * Para almacenar cuentas de banco en el HasMap, puedo Hacerlo
		 * de dos formas
		 * primero creando la cuenta y agregandola despues
		 */
		Cuenta ana = new Cuenta("Ana",15000,1000,25000,"Debito");
		//la agregamos al HashMap
		cuentas.put(1001, ana);
		
		//Otra forma de agragar cuentas al hashMap es creandolas directamente
		//en el
		cuentas.put(1002, new Cuenta("Alfredo",10000,500,30000,"Debito"));
		cuentas.put(1003, new Cuenta("Edwin",1000,100,20000,"Debito"));
		cuentas.put(1004, new Cuenta("Omar",11000,4000,50000,"Debito"));
		cuentas.put(1005, new Cuenta("Alexis",3000,500,30000,"Debito"));
		
		//Creamos nuestro objeto Cajero al cual le daremos acceso a este
		//HashMap
		
		Cajero cajero1 = new Cajero("Angelopolis, puebla",cuentas);
		
		//Probar el metodo consultar de nuestro cajero
		System.out.println(cajero1.consultar(1005));
		
		//probando el metodo retirar pero excediendo el limite
		// del cajero
		
		System.out.println(cajero1.retirar(1001, 10000));
		
		//probando un retiro exitoso
		System.out.println(cajero1.retirar(1005, 500));
		System.out.println(cajero1.retirar(1005, 500));
		
		//Probando a depositar exitoso
		System.out.println(cajero1.depositar(1004, 4000));
		
		System.out.println(cajero1.depositar(1003, 20000));
		
	}

}
