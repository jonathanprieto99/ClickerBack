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
    Usuarios usuarios;

    @Column
    Boolean estado;

    //here goes the form actually


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
