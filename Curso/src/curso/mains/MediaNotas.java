package curso.mains;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nota1 = scan.next();
		String nota2 = scan.next();
		String nota3 = scan.next();
		scan.close();
		
		double media = Media.getMedia(new String[] {nota1,nota2,nota3});
		
		System.out.println(String.format("A média é %s %s", media , media>=60 ? ":-)" : ":-("));

		
	}

}
