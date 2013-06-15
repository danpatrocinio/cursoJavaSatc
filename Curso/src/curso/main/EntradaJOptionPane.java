package curso.main;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {

	
	
	public static void main(String[] args) {
		String palavra1 = JOptionPane.showInputDialog("Digite a primeira palavra", null);

		String palavra2 = JOptionPane.showInputDialog("Digite a segunda palavra", null);

		String palavra3 = JOptionPane.showInputDialog("Digite a terceira palavra", null);

		JOptionPane.showMessageDialog(null, String.format(" %s %s %s!", palavra1, palavra2, palavra3));

		System.exit(0);
		
	}

}
