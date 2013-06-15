package curso.mains;

import javax.swing.JOptionPane;

public class Extenso {

	/**
	 * 1.2 Número por extenso 
	 */
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("Digite um número", null);

		String numero = "";

		switch (Integer.valueOf(num)) {
		case 0:
			numero = "Zero";
			break;
		case 1:
			numero = "Um";
			break;
		case 2:
			numero = "Dois";
			break;
		case 3:
			numero = "Três";
			break;
		case 4:
			numero = "Quatro";
			break;
		case 5:
			numero = "Cinco";
			break;
		case 6:
			numero = "Seis";
			break;
		case 7:
			numero = "Sete";
			break;
		case 8:
			numero = "Oito";
			break;
		case 9:
			numero = "Nove";
			break;
		case 10:
			numero = "Dez";
			break;

		default:
			numero = "Numero inválido!";
			break;
		}
		
		JOptionPane.showMessageDialog(null, String.format("%s", numero), 
				"Extenso", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}

}
