package empresa;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		if (dia < 1 || dia > 31) {
			throw new IllegalArgumentException("dia é inválido");
		}
		if (mes < 1 || mes > 12) {
			throw new IllegalArgumentException("mês é inválido");
		}
		if (ano < 1 || String.valueOf(ano).length() != 4) {
			throw new IllegalArgumentException("ano é inválido");
		}
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}
}