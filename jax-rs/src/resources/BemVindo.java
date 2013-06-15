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

	@GET
	@Path("/{p1}/{p2}/{p3}/{p4}/{p5}/{p6}/{p7}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAnyResource(@PathParam("p1") String p1, @PathParam("p2") String p2,
								@PathParam("p3") String p3, @PathParam("p4") String p4,
								@PathParam("p5") String p5, @PathParam("p6") String p6, @PathParam("p7") String p7){
		return String.format("Você acessou o recurso: %s %s %s %s %s %s %s!", p1, p2, p3, p4, p5, p6, p7);
	}

}
