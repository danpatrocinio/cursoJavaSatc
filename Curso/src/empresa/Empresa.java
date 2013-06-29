package empresa;

public class Empresa {

	static int bloco = 10;
	String cnpj;
	String nome;
	Funcionario[] funcionarios = new Funcionario[bloco];
	
	void adiciona(Funcionario f){
		Integer vaga = vagaEmAberto();
		if (vaga != null) 
			funcionarios[vaga] = f;
		else {
			adicionaBloco();
			adiciona(f);
		}
	}
	
	private Integer vagaEmAberto(){
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] == null) {
				return i;
			}
		}
		return null;
	}
	
	private void adicionaBloco(){
		Funcionario[] novoBloco = new Funcionario[funcionarios.length + bloco];
		for (int i = 0; i < funcionarios.length; i++) {
			novoBloco[i] = funcionarios[i];
		}
		funcionarios = novoBloco;
	}
	
	void mostra(){
		System.out.println(String.format("CNPJ: %s - %s", cnpj, nome));
	}
	
	void mostraFuncionarios(){
		for (Funcionario f : funcionarios) {
			if (f!=null) {
				f.mostra();
			}
		}
	}
	
}
