package clicker.back.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

public class Registrodecambio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @Column
    String operacion;

    @Column
    Long usuarioSolicitando;

    @Column
    Date fecha;

    @Column
    Time time;

    @Column
    String tablaAfectada;

    @Column
    String idAfectado;

    @Column
    String ipUsuario;


}
