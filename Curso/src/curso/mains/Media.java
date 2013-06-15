package curso.mains;

public class Media {

	public static void main(String[] args) {

		System.out.println("\n\nExercicio 2.2:\n");
		
		System.out.println("A média é " + getMedia(args));
	}
	
	public static double getMedia(String[] args) {
		int index = 0;
		double soma = 0;
		if (args!=null && args.length > 1) {
			for (String valor : args) {
				try {
					double numero = Double.parseDouble(valor);
//					System.out.println(String.format("número %s com o valor %s", ++index, numero));
					++index;
					soma = soma + numero;
				} catch (NumberFormatException e) {
					System.out.println(String.format("Não foi possível reconhecer o valor %s como número!", valor));
				}
			}			
			return soma/index;
		}
		return 0;		
	}

}
