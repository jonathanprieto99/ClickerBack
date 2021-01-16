package clicker.back.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {

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

    @Id
    @Column(unique = true,name = "id_usuario")
    String correo;

    @Column
    String password;

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

    @Column
    Boolean enabled;

    @Column
    String rol;

    @Column
    Long balance;

    @Column
    Integer cantidadCarrosAno;

    @JsonIgnoreProperties("usuario")
    @OneToMany(cascade = CascadeType.ALL)
    List<AutoSemiNuevo> carrosPosteados;

    @JsonIgnoreProperties("usuario")
    @OneToMany(cascade = CascadeType.ALL)
    List<Denuncia> denuncias;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Integer getCantidadCarrosAno() {
        return cantidadCarrosAno;
    }

    public void setCantidadCarrosAno(Integer cantidadCarrosAno) {
        this.cantidadCarrosAno = cantidadCarrosAno;
    }

    public List<AutoSemiNuevo> getCarrosPosteados() {
        return carrosPosteados;
    }

    public void setCarrosPosteados(List<AutoSemiNuevo> carrosPosteados) {
        this.carrosPosteados = carrosPosteados;
    }

    public List<Denuncia> getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(List<Denuncia> denuncias) {
        this.denuncias = denuncias;
    }
}
