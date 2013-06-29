package entidades;

public class MainEntidades {

	public static void mainM(String[] args) {

		Pessoa p = new Pessoa();
		p.nome = "Maria";
		for (int i = 0; i < 5; i++) {
			p.fazAniversario();
			p.mostra();
		}
		
	}

	public static void main(String[] args) {
		
		Casa2 casa = new Casa2(); 
		
		for (int i = 0; i < 15; i++) {
			casa.adicionaPorta();
		}
		
		System.out.println(casa.quantasPortasEstaoAbertas());
	}
	
	
}
