package banco;

public class Programa {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.dono = "Jo�o";
		conta1.saldo = 1000.0;

		Conta conta2 = new Conta();
		conta2.dono = "Maria";
		conta2.saldo = 0.0;

		conta1.transfere(conta2, 500.00);
		
		System.out.println(conta1.dono + " tem " + conta1.saldo);
		System.out.println(conta2.dono + " tem " + conta2.saldo);
	}

}
