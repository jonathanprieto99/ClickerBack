package clicker.back.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Documentos {
    @Id
    String documentname;

    @Column
    Integer documentsize;
}
