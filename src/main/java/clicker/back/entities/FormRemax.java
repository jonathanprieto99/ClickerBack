package clicker.back.entities;

import javax.persistence.*;

@Entity
public class FormRemax {
    @Column(name = "id_form_remax")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_usuario")
    @OneToOne
    Usuario usuario;

    @Column
    Boolean estado;

    //here goes the form actually


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuarios() {
        return usuario;
    }

    public void setUsuarios(Usuario usuario) {
        this.usuario = usuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
