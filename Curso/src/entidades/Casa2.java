package entidades;

public class Casa2 {

	String cor;
	Porta[] portas;
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas(){
		int qtd = 0;
		for (Porta porta : portas) {
			if (porta!=null && porta.estaAberta()) {
				qtd++;
			}
		}
		return qtd;
	}
	
	void adicionaPorta(){
		Porta[] portasArray = new Porta[portas!=null ? portas.length + 1 : 1];
		Porta p = new Porta();
		p.abre();
		portasArray[portasArray.length-1] = p;
		portas = portasArray;
	}
	
}
