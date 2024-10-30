package com.modelo;

public class Cuenta {
	//En el paquete com.modelo guardamos la informacion
	/*
	 * de las entidades u objetos a los cuales
	 * queremos acceder. para este ejemplo crearemos 
	 * varias cuentas que almcacenaremos en un HashMap para
	 * simular una pequeña BD
	 */
	
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipo;
	
	public Cuenta() {
		
	}

	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String tipo) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipo = tipo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", tipo=" + tipo + "]";
	}
	
}
