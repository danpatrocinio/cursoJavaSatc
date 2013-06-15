package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class BemVindo {

	@GET
	@Path("/{p1}/{p2}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSaudacoes(@PathParam("p1") String p1, @PathParam("p2") String p2){
		return String.format("Bem vindo %s %s!", p1, p2);
	}

}
