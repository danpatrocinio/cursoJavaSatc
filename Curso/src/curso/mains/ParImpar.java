package curso.mains;

public class ParImpar {

	public static void main(String[] args) {
		System.out.println("\n\nExercicio 2.4:\n");

		for (String valor : args) {
			try {
				Integer numero = Integer.valueOf(valor);
				System.out.println("n�mero " + numero + " � " + (numero % 2 == 0 ? " par." : " �mpar."));				
			} catch (NumberFormatException e) {
				System.out.println("N�o foi poss�vel reconhecer o valor " + valor + " como n�mero inteiro!");				
			}
		}
	}

}
