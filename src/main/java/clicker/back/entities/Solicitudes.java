package clicker.back.entities;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Solicitudes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long solicitudesId;

    @Column
    String tipouso;

    @Column
    String tipoauto;

    @Column
    Boolean credito;

    @Column
    String entidadcrediticia;

    @JoinColumn(name = "id_auto")
    @ManyToOne
    Autos auto;

    @JoinColumn(name = "id_user")
    @ManyToOne
    Usuarios usuario;


    @Column
    Date fecha;

    @Column
    String canalinput;

    @Column
    String ciudadcompra;

    @Column
    Time hora;

    @Column
    String tiempocompra;

}

