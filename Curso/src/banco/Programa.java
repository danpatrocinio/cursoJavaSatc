package banco;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100.0;
		f1.dataEntrada = new Date();
		f1.recebeAumento(50.0);
//		f1.mostra();
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Hugo";
		f2.salario = 100.0;
		f2.recebeAumento(50.0);
//		f2.mostra();
		
//		compara(f1, f2);
		
		f2 = f1;
		
		f1.nome = "f1";
		f2.mostra();

		compara(f1, f2);
		
		f2.nome = "f2";
		
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
