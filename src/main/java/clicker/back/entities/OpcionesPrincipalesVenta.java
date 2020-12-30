package clicker.back.entities;

import javax.persistence.*;

@Entity
public class OpcionesPrincipalesVenta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idOpciones;

    @Column(unique = true)
    String titulo;

    @Column
    Boolean link;

    @Column(length = 1000)
    String transmitido;

    @Column(length = 1000)
    String urlImagen;

    @Column
    Boolean activar;

    @Column(length = 30)
    String textoBoton;

    @Column
    String subtitulo;




}
