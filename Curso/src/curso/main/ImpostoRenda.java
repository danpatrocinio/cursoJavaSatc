package curso.main;

import javax.swing.JOptionPane;

public class ImpostoRenda {
	
	public static void main(String[] args) {
		
		try {
			double renda = Double.valueOf(JOptionPane.showInputDialog("Digite sua renda mensal", null));
			double percentual = 0;
			if (renda <= 1164.00) {
				JOptionPane.showMessageDialog(null, "Você é isento de imposto de renda!");
			} else if (renda > 1164 && renda <= 2326) {
				percentual = 0.15;
				JOptionPane.showMessageDialog(null, "Renda mensal: " + renda + "\nImposto de Renda: " 
						+ renda*percentual + "\nPercentual Aplicado: 15%");					
			} else {
				percentual = 0.275;
				JOptionPane.showMessageDialog(null, "Renda mensal: " + renda + "\nImposto de Renda: " 
						+ renda*percentual + "\nPercentual Aplicado: 27,5%");					
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Renda mensal informada não é um valor válido!");
		}			

		System.exit(0);
		
	}

}
