package empresa;

import java.util.Random;

public class TesteEmpresa {

	public static void main(String[] args) {
				
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345678911234");
		empresa.setNome("Empresa S.A.");
		for (int i = 0; i < 31; i++) {
			Funcionario f = new Funcionario("fun " + i, new Data(i+1, 05, 2013), new Double(new Random(100).nextDouble() * i+1));
			f.setDepartamento("dep " + i);
			f.setRg(String.format("%s.%s%s%S.%s%s%s-%s%s", i,i,i,i,i,i,i,i,i));
			empresa.adiciona(f);
		}
		
		empresa.mostra();
		empresa.mostraFuncionarios();
	}

}
