package client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class TesteCotacaoResource {

	public static void main(String[] args) {
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:9090/cotacao/DollarToReal");
		String cotacao = resource.get(String.class);
		System.out.println(cotacao);
		
		resource = client.resource("http://localhost:9090/Daniel/Patrocinio");
		System.out.println(resource.get(String.class));
		
		
	 }
	
}
