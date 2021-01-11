package clicker.back.entities;

import javax.persistence.*;

@Entity
public class Denuncia {
    @Column(name = "id_denuncia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_auto_semi_nuevo")
    @ManyToOne
    AutoSemiNuevo autoSemiNuevo;

    @JoinColumn(name = "id_usuario")
    @ManyToOne
    Usuarios usuario;

    @Column(length = 1000)
    String descripcion;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
