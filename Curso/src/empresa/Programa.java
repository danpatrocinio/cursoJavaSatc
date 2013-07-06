package empresa;

import empresa.Data;


public class Programa {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Hugo",new Data(16,7,2012), 100.0);
		f1.recebeAumento(50.0);
//		f1.mostra();
		
		Funcionario f2 = new Funcionario("Hugo",new Data(16,7,2012), 100.0);
		f2.recebeAumento(50.0);
//		f2.mostra();
		
//		compara(f1, f2);
		
		f2 = f1;
		
		f1.setNome("f1");
		f2.mostra();

		compara(f1, f2);
		
		f2.setNome("f2");
		
		compara(f1, f2);
	}
	
	static void compara(Funcionario f1, Funcionario f2) {
		if (f1 == f2) {
			System.out.println("\niguais");
		} else {
			System.out.println("\ndiferentes");
		}
	}

}
