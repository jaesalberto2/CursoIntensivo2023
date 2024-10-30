package menu;
import javax.swing.JOptionPane;

public class MenuSaludos {

	public static void main(String[] args) {
		int opc;
		do {
		opc = Integer.parseInt(JOptionPane.showInputDialog(null,""
				+ "1.-SaludoMX\n2.-Saludo USA \n3.-Saludo Italiano"
				+ "\nSaludo Aleman \n"
				+ "\n5.-Saludo Frances\n6.-Salir",JOptionPane.INFORMATION_MESSAGE));
		
		switch(opc) {
		case 1;
			break;
		case 2;
			break;
		case 3;
			break;
		case 4;
			break;
		case 5;
			break;
		case 6;
			break;
default : JOptionPane.showMessageDialog(null,"Opcion invalida");
		}
	}

}
