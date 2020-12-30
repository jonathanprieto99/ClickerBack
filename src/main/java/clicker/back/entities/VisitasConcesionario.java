package clicker.back.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class VisitasConcesionario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idVisita;

    @JoinColumn(name = "id_user")
    @ManyToOne
    User user;

    @JoinColumn(name ="id_sede_concesionario")
    @ManyToOne
    SedesConcesionarios sedesConcesionario;

    @Column
    Date fechaVisita;

    @Column
    Time horaVisita;

    @JoinColumn(name = "concesionario")
    @ManyToOne
    Concesionarios concesionario;



}
