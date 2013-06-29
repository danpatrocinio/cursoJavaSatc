package entidades;

public class Porta {

	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre(){
		if (!estaAberta()) {
			aberta = true;
		}
	}
	
	void fecha(){
		if (estaAberta()) {
			aberta = false;
		}
	}
	
	void pinta(String cor){
		this.cor = cor;
	}
	
	boolean estaAberta(){
		return aberta;
	}
	
}
