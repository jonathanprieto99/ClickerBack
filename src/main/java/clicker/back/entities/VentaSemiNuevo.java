package clicker.back.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class VentaSemiNuevo {
    @Column(name = "id_venta_semi_nuevo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_auto_semi_nuevo")
    @OneToOne
    AutoSemiNuevo autoSemiNuevo;

    @JoinColumn(name = "id_vendedor")
    @ManyToOne
    Usuarios vendedor;

    @Column
    Date fecha;

    @Column
    String ciudad_compra;

    @Column
    String link_qr;

    @Column
    Boolean pagado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AutoSemiNuevo getAutoSemiNuevo() {
        return autoSemiNuevo;
    }

    public void setAutoSemiNuevo(AutoSemiNuevo autoSemiNuevo) {
        this.autoSemiNuevo = autoSemiNuevo;
    }

    public Usuarios getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuarios vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad_compra() {
        return ciudad_compra;
    }

    public void setCiudad_compra(String ciudad_compra) {
        this.ciudad_compra = ciudad_compra;
    }

    public String getLink_qr() {
        return link_qr;
    }

    public void setLink_qr(String link_qr) {
        this.link_qr = link_qr;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
}
