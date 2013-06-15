package curso.mains;

public class Media {

	public static void main(String[] args) {

		System.out.println("\n\nExercicio 2.2:\n");
		
		System.out.println("A m�dia � " + getMedia(args));
	}
	
	public static double getMedia(String[] args) {
		int index = 0;
		double soma = 0;
		if (args!=null && args.length > 1) {
			for (String valor : args) {
				try {
					double numero = Double.parseDouble(valor);
//					System.out.println(String.format("n�mero %s com o valor %s", ++index, numero));
					++index;
					soma = soma + numero;
				} catch (NumberFormatException e) {
					System.out.println(String.format("N�o foi poss�vel reconhecer o valor %s como n�mero!", valor));
				}
			}			
			return soma/index;
		}
		return 0;		
	}

}
