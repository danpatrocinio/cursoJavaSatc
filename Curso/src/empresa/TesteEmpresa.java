package empresa;

import java.util.Random;

public class TesteEmpresa {

	public static void main(String[] args) {
				
		Empresa empresa = new Empresa();
		empresa.cnpj = "12345678911234";
		empresa.nome = "Empresa S.A.";
		for (int i = 0; i < 77; i++) {
			Funcionario f = new Funcionario();
			f.nome = "fun " + i;
			f.departamento = "dep " + i;
			f.dataEntrada = new Data(i+1, 05, 2013);
			f.rg = String.format("%s.%s%s%S.%s%s%s-%s%s", i,i,i,i,i,i,i,i,i);
			f.salario = new Double(new Random(100).nextDouble() * i+1);
			empresa.adiciona(f);
		}
		
		empresa.mostra();
		empresa.mostraFuncionarios();
	}

}
