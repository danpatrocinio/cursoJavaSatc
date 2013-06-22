package curso.mains;

public class ClassesEObjetos {

	public static void main(String[] args) {

//		 Classe: Strign
//		Declaração do Método: public boolean endsWith(String suffix)
//		Exemplo de Uso:
//		String strValue = "Hello";
//		boolean endsWith = strValue.endsWith( "lo" );
		String strsEnd = "Hello";
		strsEnd.endsWith("lo");
		
		
//		Classe: Double
//		Declaração do Método: public int intValue()
//		Exemplo de Uso:
//		Double d = 10.10;
//		int i = d.intValue();
		Double d = 10.10;
		d.intValue();
		
		Integer integer = 10;
		
		if (integer instanceof Integer) {
			System.out.println("Integer: " + integer);
		}
		
		Character ch = 'A';
		
		System.out.println(integer.getClass().getSimpleName() + ": " + integer);
		System.out.println(strsEnd.getClass().getSimpleName() + ": " + strsEnd);
		System.out.println(d.getClass().getSimpleName() + ": " + d);
		System.out.println(ch.getClass().getSimpleName() + ": " + ch);
		
		String str1 = "ola";
		String str2 = "bye";
		
		compara(str1, str2);
		
		str1 = new String("bye");
		
		compara(str1, str2);
		
		str2 = "ola";
		str1 = str2;
		
		compara(str1, str2);
		
	}
	
	public static void compara(String str1, String str2){
		// Comparando valores
		System.out.println("Valor é igual = " + str1.equals(str2));

		// Comparando referencias
		System.out.println("Referencia é igual = " + (str1 == str2));
	}

}
