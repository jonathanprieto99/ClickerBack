package clicker.back.entities;

import javax.persistence.*;
@Entity
public class InteresadoReventa {

    @Column(name = "id_interesados_reventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_auto_semi_nuevo")
    @ManyToOne
    AutoSemiNuevo autoSemiNuevo;

    @JoinColumn(name = "id_usuario")
    @ManyToOne
    Usuarios usuario;

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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
