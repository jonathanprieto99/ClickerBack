package clicker.back.entities;

import javax.persistence.*;

@Entity
public class Usuarios {
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @Column
    String fbId;

    @Column
    String nombre;

    @Column
    String apellidos;

    @Column(length = 1000)
    String imagenPerfil;

    @Column
    Long numTelefono;

    @Column
    String correo;

    @Column(length = 50)
    String tipoLicencia;

    @Column(length = 100)
    String tiempoLicencia;

    @Column
    Boolean trabajoAplicativo;

    @Column
    String tipoDocumento;

    @Column(length = 25)
    String numDocumento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFbId() {
        return fbId;
    }

    public void setFbId(String fbId) {
        this.fbId = fbId;
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

    public String getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(String imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public Long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getTiempoLicencia() {
        return tiempoLicencia;
    }

    public void setTiempoLicencia(String tiempoLicencia) {
        this.tiempoLicencia = tiempoLicencia;
    }

    public Boolean getTrabajoAplicativo() {
        return trabajoAplicativo;
    }

    public void setTrabajoAplicativo(Boolean trabajoAplicativo) {
        this.trabajoAplicativo = trabajoAplicativo;
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
