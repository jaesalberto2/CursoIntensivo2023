package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	private int folio = 1;//variable auxiliar para implementar el folio del ticket
	
	public Cajero() {
		
	}
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta consultar(int numeroCuenta) {
		/*
		 * Instanciamos una cuenta para devolver ese valor
		 */
		Cuenta cuenta = null;
		//La cuenta que vamos a consultar esta guardada en un 
		//HashMap entonces la asignamos si es que existe
		
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Instanciamos un Ticket vacio
		Ticket ticket = null;
		
		//Antes de realizar un retiro, primero necesitamos buscar
		//la cuenta 
		//si la cuenta existe, entonces la podemos manipular
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una vez localizamos la cuenta y la podemos manipular
			//existen validaciones antes de poder realizar dicha operacion
			//vamos a crear un ejemplo de que el cajero solo permite
			//retirar cierta cantidad
			if (monto>9000) {
				System.out.println("Solo puedes retirar un maximo de 9000");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para el retiro");
				return ticket;
			}else if((cuenta.getSaldo()-monto)<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo en la cuenta");
				return ticket;
			}else {
				/*
				 * Si el retiro puede realizarse actualizamos el saldo de la cuenta
				 * 
				 */
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				//Entonces ahora si emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			//Si la cuenta no existe
			System.out.println("No hay una cuenta asociada a ese cliente");
		
		return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validamos si el monto a depositar es mayor que
			//el saldo maximo que permite la cuenta
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el saldo maximo"
						+ " permitido en la cta");
				return ticket;
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo exederia el maximo permitido"
						+ " en la cuenta");
			}else {//Si el deposito puede realizarse
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {System.out.println("No hay una cuenta asociada a eese cliente");}
		
		
		return ticket;
	}
	
	/*
	 * En este paquete se encuetra contenida la clase 
	 * que creara los objetos que realizaran las operaciones
	 */
	
	

}
