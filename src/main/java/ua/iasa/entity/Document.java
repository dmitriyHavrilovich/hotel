package ua.iasa.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "document")
public class Document {

    @Id
    private Long id;
    @Column
    private String date;
    private DocumentType documentType;
    private MovementDocument movementDocument;

}
