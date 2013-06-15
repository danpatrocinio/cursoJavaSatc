package curso.mains;

import javax.swing.JOptionPane;

public class Potencia {

	
	
	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Digite um número inteiro", null);
		String exp = JOptionPane.showInputDialog("Digite o seu expoente", null);

		try {
			if (Integer.valueOf(exp) <= 0) {
				JOptionPane.showMessageDialog(null, "Expoente inválido!", "Mensagem", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			} else {
					Integer resultado = Integer.valueOf(base);
					Integer expoente = Integer.valueOf(exp);
					while(expoente>0){
						if (expoente > 1) {
							System.out.print(base +  " * ");
							resultado = resultado * Integer.valueOf(base);
						} else
							System.out.println(base + " = " + resultado);
							expoente--;
					}
				}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Foi informado um número inválido!", "Mensagem", JOptionPane.ERROR_MESSAGE);
			System.exit(0);			
		}
	}
}
