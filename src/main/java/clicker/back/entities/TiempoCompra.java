package clicker.back.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TiempoCompra {
    @Id
    Long idTiempocompra;

    @Column
    String tiempo;
}
