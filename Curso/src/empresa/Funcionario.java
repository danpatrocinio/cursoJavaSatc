package empresa;

public class Funcionario {

	String nome;
	String departamento;
	Double salario;
	Data dataEntrada;
	String rg;
	
	void recebeAumento(Double valorAumento){
		salario += valorAumento;
	}
	
	double calculaGanhoAnual(){
		return salario*12;
	}
	
	void mostra(){
		System.out.println(String.format("Funcionario:: " +
				"\n\tNome: %s " +
				"\n\tDepartamento: %s " +
				"\n\tSalario: %s " +
				"\n\tData de entrada: %s " +
				"\n\tRG: %s" +
				"\n\tGanho anual: %s", nome, departamento, salario, dataEntrada.mostra(), rg, calculaGanhoAnual()));
	}
	
}
