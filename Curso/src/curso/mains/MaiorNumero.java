package curso.mains;

import javax.swing.JOptionPane;

public class MaiorNumero {

	/**
	 * Maior numero varrendo array
	 */
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int maior = -999999999;
		try {
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
			}
			for (int i = 0; i < numeros.length; i++) {
				maior = numeros[i] > maior ? numeros[i] : maior; 
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "N�mero inv�lido!", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}		
		JOptionPane.showMessageDialog(null, String.format("O maior n�mero informado � %s", maior), "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
}
