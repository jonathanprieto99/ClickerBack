package clicker.back.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class AutoSemiNuevo {
    @Column(name = "id_auto_semi_nuevo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

    @JoinColumn(name = "id_auto")
    @ManyToOne
    Auto auto;

    @JsonIgnoreProperties({"carrosPosteados","denuncias","interesadoReventas","solicitudesRetiros","formRemax","solicitudesRetiro"})
    @JoinColumn(name = "id_usuario")
    @ManyToOne
    Usuario usuario;

    @Column
    Long precioVenta;

    @Column
    String moneda;

    @Column
    Integer codversion;

    @Column
    String version;

    @ElementCollection
    List<String> ciudadesDisponibles;

    @Column
    Long kilometraje;

    @Column
    String tipoAuto;

    @Column
    Boolean presentar;

    @Column
    Boolean comprado;

    @Column
    Boolean validado;

    @Column
    Integer comisionUsuario;

    @Column
    Integer comisionVendedor;

    @Column
    Integer comisionEmpresa;

    @Column
    Date fechaPublicacion;

    @Column
    Boolean enabled;

    @Column
    Boolean duenoCarro;

    @Column(length = 1000)
    String video;

    @ElementCollection
    List<String> fotos;

    @OneToOne(cascade = CascadeType.ALL)
    SolicitudRemocionAuto solicitudRemocionAuto;

    @JsonIgnoreProperties({"autoSemiNuevo"})
    @OneToMany(cascade = CascadeType.ALL)
    List<InteresadoCompra> interesadoCompras;

    @JsonIgnoreProperties({"autoSemiNuevo"})
    @OneToMany(cascade = CascadeType.ALL)
    List<InteresadoReventa> interesadoReventas;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Long precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Integer getCodversion() {
        return codversion;
    }

    public void setCodversion(Integer codversion) {
        this.codversion = codversion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getCiudadesDisponibles() {
        return ciudadesDisponibles;
    }

    public void setCiudadesDisponibles(List<String> ciudadesDisponibles) {
        this.ciudadesDisponibles = ciudadesDisponibles;
    }

    public Long getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Long kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public Boolean getPresentar() {
        return presentar;
    }

    public void setPresentar(Boolean presentar) {
        this.presentar = presentar;
    }

    public Boolean getComprado() {
        return comprado;
    }

    public void setComprado(Boolean comprado) {
        this.comprado = comprado;
    }

    public Boolean getValidado() {
        return validado;
    }

    public void setValidado(Boolean validado) {
        this.validado = validado;
    }

    public Integer getComisionUsuario() {
        return comisionUsuario;
    }

    public void setComisionUsuario(Integer comisionUsuario) {
        this.comisionUsuario = comisionUsuario;
    }

    public Integer getComisionVendedor() {
        return comisionVendedor;
    }

    public void setComisionVendedor(Integer comisionVendedor) {
        this.comisionVendedor = comisionVendedor;
    }

    public Integer getComisionEmpresa() {
        return comisionEmpresa;
    }

    public void setComisionEmpresa(Integer comisionEmpresa) {
        this.comisionEmpresa = comisionEmpresa;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDuenoCarro() {
        return duenoCarro;
    }

    public void setDuenoCarro(Boolean duenoCarro) {
        this.duenoCarro = duenoCarro;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }

    public SolicitudRemocionAuto getSolicitudRemocionAuto() {
        return solicitudRemocionAuto;
    }

    public void setSolicitudRemocionAuto(SolicitudRemocionAuto solicitudRemocionAuto) {
        this.solicitudRemocionAuto = solicitudRemocionAuto;
    }

    public List<InteresadoCompra> getInteresadoCompras() {
        return interesadoCompras;
    }

    public void setInteresadoCompras(List<InteresadoCompra> interesadoCompras) {
        this.interesadoCompras = interesadoCompras;
    }

    public List<InteresadoReventa> getInteresadoReventas() {
        return interesadoReventas;
    }

    public void setInteresadoReventas(List<InteresadoReventa> interesadoReventas) {
        this.interesadoReventas = interesadoReventas;
    }
}
