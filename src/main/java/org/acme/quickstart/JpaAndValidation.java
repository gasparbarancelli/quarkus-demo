package org.acme.quickstart;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "DEMO")
@NamedQuery(name = "JpaAndValidation.findAll",
        query = "SELECT b FROM JpaAndValidation b ORDER BY b.descricao",
        hints = @QueryHint(name = "org.hibernate.cacheable", value = "true") )
@Cacheable
public class JpaAndValidation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Max(value = 100, message = "Descrição não pode ter mais de 100 digitos")
    @Min(value = 10, message = "Descrição deve conter mais de 10 digitos")
    @NotBlank(message="Descrição não pode ser vazia")
    private String descricao;

    public Long getId() {
        return id;
    }

    public JpaAndValidation setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public JpaAndValidation setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

}
