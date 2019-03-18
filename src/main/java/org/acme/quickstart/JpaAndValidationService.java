package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;

@ApplicationScoped
public class JpaAndValidationService {

    @Inject private EntityManager entityManager;

    public JpaAndValidation persist(@Valid JpaAndValidation jpaAndValidation) {
        entityManager.persist(jpaAndValidation);
        return jpaAndValidation;
    }

    public List<JpaAndValidation> findAll() {
        return entityManager.createNamedQuery("JpaAndValidation.findAll", JpaAndValidation.class).getResultList();
    }

}
