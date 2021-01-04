package clicker.back.entities;

import javax.persistence.*;

@Entity
public class Usuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idUser;

    @Column
    String fbId;

    @Column
    String nombre;

    @Column
    String appellidos;

    @Column(length = 1000)
    String imagenperfil;

    @Column
    Long numtelefono;

    @Column
    String correo;

    @Column(length = 50)
    String tipolicencia;

    @Column(length = 100)
    String tiempolicencia;

    @Column
    Boolean trabajoaplicativo;

    @Column
    String tipodocumento;

    @Column(length = 25)
    String numdocumento;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public String getAppellidos() {
        return appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public String getImagenperfil() {
        return imagenperfil;
    }

    public void setImagenperfil(String imagenperfil) {
        this.imagenperfil = imagenperfil;
    }

    public Long getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(Long numtelefono) {
        this.numtelefono = numtelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipolicencia() {
        return tipolicencia;
    }

    public void setTipolicencia(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    public String getTiempolicencia() {
        return tiempolicencia;
    }

    public void setTiempolicencia(String tiempolicencia) {
        this.tiempolicencia = tiempolicencia;
    }

    public Boolean getTrabajoaplicativo() {
        return trabajoaplicativo;
    }

    public void setTrabajoaplicativo(Boolean trabajoaplicativo) {
        this.trabajoaplicativo = trabajoaplicativo;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(String numdocumento) {
        this.numdocumento = numdocumento;
    }
}
