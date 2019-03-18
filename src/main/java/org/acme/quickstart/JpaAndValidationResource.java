package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import java.util.List;

@Path("jpa-and-validation")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class JpaAndValidationResource {

    @Inject private JpaAndValidationService jpaAndValidationService;

    @GET
    public List<JpaAndValidation> findAll() {
        return jpaAndValidationService.findAll();
    }

    @POST
    public JpaAndValidation persist(@Valid JpaAndValidation jpaAndValidation) {
        return jpaAndValidationService.persist(jpaAndValidation);
    }

}
