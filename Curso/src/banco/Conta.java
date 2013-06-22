package banco;

public class Conta {

	Integer numero;
	String dono;
	Double saldo;
	Double limite;
	
	boolean saca(Double valor){
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	void deposita(Double valor){
		saldo += valor;
	}
	
	
	void transfere(Conta contaDestino, Double valor){
		contaDestino.saldo += valor;
		saldo -= valor;
	}
	
}
