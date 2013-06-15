package curso.main;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String palavra1 = scan.next();
		String palavra2 = scan.next();
		String palavra3 = scan.next();
		scan.close();

		System.out.println(String.format("%s %s %s!", palavra1, palavra2, palavra3));
		
	}

}
