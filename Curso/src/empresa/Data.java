package empresa;

public class Data {
	int dia;
	int mes;
	int ano;

	
	public Data(){
	}
	
	public Data(Integer dia, Integer mes, Integer ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String mostra(){
		return dia + "/" + mes + "/" + ano;
	}
}