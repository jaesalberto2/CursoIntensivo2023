package com;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc;
		
		Cientifica cientifica1 = new Cientifica("Casio","Negra","E22") {
			
			@Override
			public void iniciarCalculadora() {
				
				
			}

			@Override
			public void tomarTemperatura() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa una opcion:\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division", "Calculadora", JOptionPane.INFORMATION_MESSAGE));
		switch(opc) {
		case 1:
			cientifica1.sumar();
			break;
		case 2:
			cientifica1.restar();
			break;
		case 3:
			cientifica1.multiplicacion();
			break;
		case 4:
			cientifica1.division();
			break;
		default:
			JOptionPane.showConfirmDialog(null, "Opcion invalida", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
		}

	}

}