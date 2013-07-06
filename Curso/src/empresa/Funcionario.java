package empresa;

public class Funcionario {

	private String nome;
	private String departamento;
	private Double salario;
	private Data dataEntrada;
	private String rg;
	private static int id;

	public Funcionario(){
		id++;
	}
	
	public static int getId(){
		return id;
	}
	
	public Funcionario(String nome, Data dataEntrada, Double salario){
		this.nome = nome;
		this.dataEntrada = dataEntrada;
		this.salario = salario;
	}
		
	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	void recebeAumento(Double valorAumento){
		salario += valorAumento;
	}
	
	double getCalculaGanhoAnual(){
		return salario*12;
	}
		
	public void setNome(String nome){
		this.nome = nome;
	}
	
	void mostra(){
		System.out.println(String.format("Funcionario:: " +
				"\n\tNome: %s " +
				"\n\tDepartamento: %s " +
				"\n\tSalario: %s " +
				"\n\tData de entrada: %s " +
				"\n\tRG: %s" +
				"\n\tGanho anual: %s", nome, departamento, salario, dataEntrada.getDataFormatada(), rg, getCalculaGanhoAnual()));
	}
	
}
