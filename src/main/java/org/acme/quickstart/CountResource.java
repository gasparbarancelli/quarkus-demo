package org.acme.quickstart;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/count")
public class CountResource {

    @Inject private CountService counter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int hello() {
        return counter.get();
    }

}
