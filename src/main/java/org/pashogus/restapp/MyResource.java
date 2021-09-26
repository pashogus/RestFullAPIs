package org.pashogus.restapp;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	//Tabbed Postman - REST Client - Chrome extension is used for testing HTTP methods
	
	 //http://localhost:8080/restapp/myresource/post
    //these are the details
    @GET
    @Path("/post")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "these are the details";
    }
    
  //http://localhost:8080/restapp/myresource/post
    //Created it!
    @POST
    @Path("/post")
    @Produces(MediaType.TEXT_PLAIN)
    public String postIt() {
        return "Created it!";
    }
    
    //http://localhost:8080/restapp/myresource/post/mine
    //updated mine
    @PUT
    // {} - its nothing but a parameter 
    @Path("/post/{older}")
    @Produces(MediaType.TEXT_PLAIN)
    public String putIt(@PathParam("older") String oldpost) {
        return "updated " + oldpost ;
    }
    
    //http://localhost:8080/restapp/myresource/post/mine/4
    // deleted mineat line number4
    @DELETE
    @Path("/post/{older}/{lineNumber}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteIt(@PathParam("older") String oldpost , @PathParam("lineNumber") int lineNumber ) {
        return "deleted " + oldpost + "at line number" + lineNumber;
    }
    
}
