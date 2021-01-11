package clicker.back.entities;

import javax.persistence.*;

@Entity
public class SolicitudesRetiro {
    @Column(name = "id_solicitudes_retiro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_usuario")
    @ManyToOne
    Usuarios usuario;

    @JoinColumn(name = "id_user")
    @ManyToOne
    User admin;

    @Column
    Long monto;

    @Column
    Long transferencia;

    @Column
    Boolean aceptado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }

    public Long getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Long transferencia) {
        this.transferencia = transferencia;
    }

    public Boolean getAceptado() {
        return aceptado;
    }

    public void setAceptado(Boolean aceptado) {
        this.aceptado = aceptado;
    }
}
