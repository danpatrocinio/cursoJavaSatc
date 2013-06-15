package curso.mains;

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
	}

}
