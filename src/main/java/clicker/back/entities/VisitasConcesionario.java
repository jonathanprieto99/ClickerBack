package clicker.back.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class VisitasConcesionario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idVisita;

    @JoinColumn(name = "id_user")
    @ManyToOne
    User user;

    @JoinColumn(name ="id_sede_concesionario")
    @ManyToOne
    SedesConcesionarios sedesConcesionario;

    @Column
    Date fechaVisita;

    @Column
    Time horaVisita;

    @JoinColumn(name = "concesionario")
    @ManyToOne
    Concesionarios concesionario;

    public Long getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Long idVisita) {
        this.idVisita = idVisita;
    }

    public User getUsers() {
        return user;
    }

    public void setUsers(User user) {
        this.user = user;
    }

    public SedesConcesionarios getSedesConcesionario() {
        return sedesConcesionario;
    }

    public void setSedesConcesionario(SedesConcesionarios sedesConcesionario) {
        this.sedesConcesionario = sedesConcesionario;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public Time getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(Time horaVisita) {
        this.horaVisita = horaVisita;
    }

    public Concesionarios getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionarios concesionario) {
        this.concesionario = concesionario;
    }
}
