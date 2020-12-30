package clicker.back.entities;

import javax.persistence.*;

@Entity
public class SedesConcesionarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idSedeConcesionarios;

    @Column(length = 500)
    String direccion;

    @Column(length = 20)
    String telefonoContacto;

    @Column
    String correoContacto;

    @Column
    String nombreContacto;

    @JoinColumn(name = "concesionario")
    @ManyToOne
    Concesionarios concesionario;

    @Column(length = 500)
    String linkQr;

}
