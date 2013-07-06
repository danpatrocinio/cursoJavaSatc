package curso.mains;

import java.io.IOException;
import java.util.Properties;

public class Maior {

	public static void main(String[] args) {

		System.out.println("\n\nExercicio 2.3:\n");
		
		int index = 0;

		Integer maior = 0;
		for (String valor : args) {
			try {
				Integer numero = Integer.valueOf(valor);
				maior = maior > numero ? maior : numero;
				System.out.println(String.format("n�mero %s com o valor %s",++index ,numero));
			} catch (NumberFormatException e) {
				System.out.println(String.format("N�o foi poss�vel reconhecer o valor %s como n�mero inteiro!", valor));				
			}
		}
		System.out.println("O maior n�mero � " + maior);
		Properties p = new Properties();
		p.put("prop1", "Propriedade 1");
		p.put("prop2", "Propriedade 2");
		p.put("prop3", "Propriedade 3");
		try {
			p.store(System.out , "Comentario");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
