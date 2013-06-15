package curso.mains;

public class DiasDaSemanaArray {

	/**
	 * arrays
	 */
	public static void main(String[] args) {
		
		String[] dias = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		int i = 0;
		
		System.out.println("While:: ");
		while(i<dias.length) {
			System.out.print(String.format("%s ", dias[i]));
			i++;
		}
		
		i=0;
		System.out.println("\nDo-While:: ");
		do {
			System.out.print(String.format("%s ", dias[i]));
		} while (++i<dias.length);

		System.out.println("\nFor:: ");
		for (i = 0; i < dias.length; i++) {
			System.out.print(String.format("%s ", dias[i]));			
		}
		
		System.out.println("\nOuther For");
		for (String dia : dias) {
			System.out.print(String.format("%s ", dia));
		}
	}

}
