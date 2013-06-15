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
				numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
			}
			for (int i = 0; i < numeros.length; i++) {
				maior = numeros[i] > maior ? numeros[i] : maior; 
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}		
		JOptionPane.showMessageDialog(null, String.format("O maior número informado é %s", maior), "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
}
