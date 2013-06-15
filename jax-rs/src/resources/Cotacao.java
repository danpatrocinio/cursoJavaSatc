package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cotacao")
public class Cotacao {

	@GET
	@Path("DollarToReal")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDollarToReal(){
		return "1.3";
	}
	
}
