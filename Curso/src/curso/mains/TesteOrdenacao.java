package curso.mains;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import banco.Conta;

public class TesteOrdenacao {

	public static void main (String[] args){
		Conta c1 = new Conta();
		c1.setNumero(1973);
		Conta c2 = new Conta();
		c2.setNumero(1462);
		Conta c3 = new Conta();
		c3.setNumero(1854);
		Conta c4 = new Conta();
		c4.setNumero(1983);
		
		List<Conta> contasUnSort = new LinkedList<Conta>();
		contasUnSort.add(c1);
		contasUnSort.add(c2);
		contasUnSort.add(c3);
		contasUnSort.add(c4);

		for (Conta conta : contasUnSort) {
			System.out.println(conta.getNumero());
		}
		
		System.out.println("========= ordenando ===========");
		Collections.sort(contasUnSort);
		
		for (Conta conta : contasUnSort) {
			System.out.println(conta.getNumero());
		}
	}
	
	
}
