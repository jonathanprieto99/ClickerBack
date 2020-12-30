package clicker.back.entities;

import javax.persistence.*;

@Entity
public class EmpresasTaxi {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idEmptaxi;

    @Column(unique = true)
    String empresa;



}
