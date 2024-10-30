package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	/*
	 * Esta interface va a contener el listado
	 * de metodos abstractos o instrucciones que la clase encargada
	 * de la logica tendrá que implementar y resolver
	 * 
	 * Es decir nuestro cajero es el que la implementará
	 * 
	 * Consultar una cuenta de banco
	 * 
	 */
	public Cuenta consultar (int numeroCuenta);
	
	//retirar Recursos
	
	public Ticket retirar(int numeroCuenta, double monto);
	
	//Depositar recursos
	public Ticket depositar(int numeroCuenta,double monto);
	
	
	

}
