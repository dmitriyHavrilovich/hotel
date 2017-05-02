package ua.iasa.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;

@Data
@Entity
public class JuridicalPerson extends Contractor {

    public JuridicalPerson(Long id, String phone, Set<MovementDocument> document,
                           String name, String edrpou) {
        super(id, phone, document);
        this.name = name;
        this.edrpou = edrpou;
    }

    private String name;
    private String edrpou;
}
