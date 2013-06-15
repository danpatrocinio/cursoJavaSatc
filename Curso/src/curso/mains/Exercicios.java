package curso.mains;

public class Exercicios {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Daniel dan = new Daniel();
		dan.main(args);

		Society society = new Society();
		society.main(args);
			
		DeclareAndShowVars vars = new DeclareAndShowVars();
		vars.main(args);
		
		Media media = new Media();
		media.main(new String[] {"10","XXX", "10.3", "20", "45"});

		Maior maior = new Maior();
		maior.main(new String[] {"10", "23", "5"});
		
		ParImpar parImpar = new ParImpar();
		parImpar.main(new String[] {"1","2","3","4"});
		
		for (int i = 0; i++ < 10;) {
			System.out.print(String.format(" %s ", i));
		}
		
		
	}

}
