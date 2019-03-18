package org.acme.quickstart;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("config")
public class ConfigResource {

    @Inject
    @ConfigProperty(name = "application.name")
    private String applicationName;

    @GET
    public String applicationName() {
        return applicationName;
    }

}
