package RestServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/SignUp/{name}/{password}/{mobNumber}/{email}")
public class SignUp {
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	public void SignUp()
	{
		
	}
}