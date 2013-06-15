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
					System.out.println(String.format("número %s com o valor %s", ++index, numero));
					soma = soma + numero;
				} catch (NumberFormatException e) {
					System.out.println(String.format("Não foi possível reconhecer o valor %s como número inteiro!", valor));
				}
			}			
			System.out.println("A média é " + soma/index);
		}
	}

}
