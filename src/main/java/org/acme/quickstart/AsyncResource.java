package org.acme.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@Path("async")
public class AsyncResource {

    @GET
    public CompletionStage<String> async() {
        return CompletableFuture.supplyAsync(() -> "Async");
    }

}
