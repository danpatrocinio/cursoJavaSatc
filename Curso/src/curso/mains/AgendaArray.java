package curso.mains;

public class AgendaArray {

	/**
	 * arrays
	 */
	public static void main(String[] args) {
		
		String[][] entry = {
							{"Florence", "735-1234", "Manila"},
							{"Joyce",    "983-3333", "Quezon City"},
							{"Becca",    "456-3322", "Manila"}
							};
		
		for (int i = 0; i < entry.length; i++) {
			String[] dados = entry[i];
			System.out.println("Name: " + dados[0] + "\nTel.#:" + dados[1] + "\nAdress: " +dados[2] +"\n");
		}
	}

}
