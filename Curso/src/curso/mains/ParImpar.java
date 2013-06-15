package curso.mains;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("\n\nExercicio 2.4:\n");

		for (String valor : args) {
			try {
				Integer numero = Integer.valueOf(valor);
				System.out.println("número " + numero + " é " + (numero % 2 == 0 ? " par." : " ímpar."));				
			} catch (NumberFormatException e) {
				System.out.println("Não foi possível reconhecer o valor " + valor + " como número inteiro!");				
			}
		}
	}

}
