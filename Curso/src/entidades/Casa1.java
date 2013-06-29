package entidades;

public class Casa1 {

	String cor;
	int totalDePortas;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	int quantasPortasEstaoAbertas(){
		return (porta1.estaAberta() ? 1 : 0) + (porta2.estaAberta() ? 1 : 0) + (porta3.estaAberta() ? 1 : 0); 
	}
	
}
