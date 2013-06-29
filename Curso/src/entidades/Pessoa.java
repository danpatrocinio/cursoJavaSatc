package entidades;

public class Pessoa {

	String nome;
	int idade;
	
	void fazAniversario(){
		idade++;
	}
	
	void mostra(){
		System.out.println(String.format("%s tem %s " + (idade>1 ? "anos" : "ano"), nome, idade));
	}
}
