package me.efraimgentil.samplejeejaxrs.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
	
	@GET
	public String helloWorld(){
		return "Hello darkness my old friend";
	}
	
}
