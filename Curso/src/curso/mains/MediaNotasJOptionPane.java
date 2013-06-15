package curso.mains;

import javax.swing.JOptionPane;

public class MediaNotasJOptionPane {

	
	
	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota", null);

		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota", null);

		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota", null);

		double media = Media.getMedia(new String[] {nota1,nota2,nota3});

		JOptionPane.showMessageDialog(null, String.format("A média é: %s     %s", media, media>=60 ? ":-)" : ":-("), 
				"Média", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
		
	}

}
