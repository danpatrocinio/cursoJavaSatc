package empresa;

public class Empresa {

	static int bloco = 10;
	private String cnpj;
	private String nome;
	private Funcionario[] funcionarios = new Funcionario[bloco];
	
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
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	void mostra(){
		System.out.println(String.format("CNPJ: %s - %s", cnpj, nome));
	}
	
	boolean contem(Funcionario f){
		for (Funcionario funcionario : funcionarios) {
			if (f.equals(funcionario)) {
				return true;
			}
		}
		return false;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.funcionarios[posicao];
	}
	
	void mostraFuncionarios(){
		for (Funcionario f : funcionarios) {
			if (f!=null) {
				f.mostra();
			}
		}
	}
	
}
