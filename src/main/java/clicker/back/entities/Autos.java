package clicker.back.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Autos {
    @Id
    String idAuto;

    @Column
    String modelo;

    @Column
    Long anofabricacion;

    @JoinColumn(name = "concesionario")
    @ManyToOne
    Concesionarios concesionario;

    @Column(length = 1000)
    String foto;

    @Column(length = 1000)
    String documentacion;

    @Column
    Long precio;

    @Column
    String moneda;

    @ElementCollection
    List<String> ciudadesdisp;

    @Column
    String tipocarroceria;

    @ElementCollection
    List<String> usoauto;

    @Column
    String marca;

    @Column
    Boolean presentar;

    @Column
    String version;

    @Column
    Integer codversion;

    public String getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(String idAuto) {
        this.idAuto = idAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getAnofabricacion() {
        return anofabricacion;
    }

    public void setAnofabricacion(Long anofabricacion) {
        this.anofabricacion = anofabricacion;
    }

    public Concesionarios getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionarios concesionario) {
        this.concesionario = concesionario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<String> getCiudadesdisp() {
        return ciudadesdisp;
    }

    public void setCiudadesdisp(List<String> ciudadesdisp) {
        this.ciudadesdisp = ciudadesdisp;
    }

    public String getTipocarroceria() {
        return tipocarroceria;
    }

    public void setTipocarroceria(String tipocarroceria) {
        this.tipocarroceria = tipocarroceria;
    }

    public List<String> getUsoauto() {
        return usoauto;
    }

    public void setUsoauto(List<String> usoauto) {
        this.usoauto = usoauto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getPresentar() {
        return presentar;
    }

    public void setPresentar(Boolean presentar) {
        this.presentar = presentar;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCodversion() {
        return codversion;
    }

    public void setCodversion(Integer codversion) {
        this.codversion = codversion;
    }
}
