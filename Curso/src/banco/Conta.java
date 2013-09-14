package banco;

public class Conta implements Comparable<Conta>{

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
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	void deposita(Double valor){
		saldo += valor;
	}
	
	
	boolean transfere(Conta contaDestino, Double valor){
		if (saca(valor)) {
			contaDestino.saldo += valor;
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Conta c) {
//		if (c==null && this != null) {
//			return -1;
//		}
//		if (this==null && c!=null) {
//			return 1;
//		}
//		if (c==null && this ==null) {
//			return 0;
//		}
		
		return this.getNumero().compareTo(c.getNumero());
	}
	
}
