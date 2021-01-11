package clicker.back.entities;

import javax.persistence.*;

@Entity
public class InteresadoCompra {
    @Column(name = "id_interesados_compra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_auto_semi_nuevo")
    @ManyToOne
    AutoSemiNuevo autoSemiNuevo;

    @Column
    String nombre;

    @Column
    String apellidos;

    @Column(length = 25)
    String numTelefono;

    @Column
    String correo;

    @Column
    String tipoDocumento;

    @Column
    String numDocumento;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

}

