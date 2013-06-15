package curso.main;

public class Media {

	public static void main(String[] args) {

		System.out.println("\n\nExercicio 2.2:\n");
		
		int index = 0;
		Integer soma = 0;
		if (args!=null && args.length > 1) {
			for (String valor : args) {
				try {
					Integer numero = Integer.valueOf(valor);
					System.out.println(String.format("n�mero %s com o valor %s", ++index, numero));
					soma = soma + numero;
				} catch (NumberFormatException e) {
					System.out.println(String.format("N�o foi poss�vel reconhecer o valor %s como n�mero inteiro!", valor));
				}
			}			
			System.out.println("A m�dia � " + soma/index);
		}
	}

}
