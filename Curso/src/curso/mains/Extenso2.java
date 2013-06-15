package curso.mains;

import javax.swing.JOptionPane;

public class Extenso2 {

	/**
	 * 1.2 Número por extenso 
	 */
	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("Digite um número", null);

		if ("0".equals(num)) {
			num = "Zero";
		} else if ("1".equals(num)) {
			num = "Um";
		} else if ("2".equals(num)) {
			num = "Dois";
		} else if ("3".equals(num)) {
			num = "Três";
		} else if ("4".equals(num)) {
			num = "Quatro";
		} else if ("5".equals(num)) {
				num = "Cinco";
		} else if ("6".equals(num)) {
			num = "Seis";
		} else if ("7".equals(num)) {
			num = "Sete";
		} else if ("8".equals(num)) {
			num = "Oito";
		} else if ("9".equals(num)) {
			num = "Nove";
		} else if ("10".equals(num)) {
			num = "Dez";
		} else 
			num = "Numero inválido!";
			
		
		JOptionPane.showMessageDialog(null, String.format("%s", num), 
				"Extenso", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);

	}

}
