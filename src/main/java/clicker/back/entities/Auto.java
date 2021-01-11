package clicker.back.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Auto {
    @Column(name = "id_auto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @Column
    String modelo;

    @Column
    Long anofabricacion;

    @Column
    Long precioSugerido;

    @Column(length = 1000)
    String foto;

    @Column(length = 1000)
    String documentacion;

    @Column
    String tipocarroceria;

    @ElementCollection
    List<String> usoauto;

    @Column
    String marca;

    @Column
    String cambios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getPrecioSugerido() {
        return precioSugerido;
    }

    public void setPrecioSugerido(Long precioSugerido) {
        this.precioSugerido = precioSugerido;
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

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }
}
