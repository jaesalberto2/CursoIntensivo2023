package com.respuesta;

import java.util.Date;

public class Ticket {
	
	/*
	 * Vamos a modelar nuestro objeto de  respuesta
	 * cuando las operaciones del cajero
	 * sean satisfactorias
	 * 
	 */
	
	private int folio;
	private Date fechahora;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	
	public Ticket(){
		
	}


	public Ticket(int folio, Date fechahora, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechahora = fechahora;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
	}


	public Date getFechahora() {
		return fechahora;
	}


	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
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


	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	public int getIdCajero() {
		return idCajero;
	}


	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}


	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechahora=" + fechahora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	

}
