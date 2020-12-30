package clicker.back.entities;

import javax.persistence.*;

@Entity
public class Usuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idUser;

    @Column
    String fbId;

    @Column
    String nombre;

    @Column
    String appellidos;

    @Column(length = 1000)
    String imagenperfil;

    @Column
    Long numtelefono;

    @Column
    String correo;

    @Column(length = 50)
    String tipolicencia;

    @Column(length = 100)
    String tiempolicencia;

    @Column
    Boolean trabajoaplicativo;

    @Column
    String tipodocumento;

    @Column(length = 25)
    String numdocumento;


}
