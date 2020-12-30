package clicker.back.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class ResultadosInfocorp {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long idConsulta;

    @JoinColumn(name = "id_user")
    @OneToOne
    Usuarios user;

    @Column
    Date fechaConsulta;

    @Column
    Time horaConsulta;

    @Column(length = 20)
    String documento;

    @Column(length = 100,name="RazonSocial")
    String razonSocial;

    @Column(length = 10,name ="FechaNacimiento")
    String fechaNacimiento;

    @Column(length = 10,name ="FechaProceso")
    String fechaProceso;

    @Column(length = 24,name ="Semaforos")
    String semaforos;

    @Column(length = 7,name ="Nota")
    String nota;

    @Column(length = 2,name ="NroBancos")
    String nroBancos;

    @Column(length = 20,name ="DeudaTotal")
    String deudaTotal;

    @Column(length = 20,name ="VencidoBanco")
    String vencidoBanco;

    @Column(length = 100,name ="Calificativo")
    String calificativo;

    @Column(length = 2,name ="SemaActual")
    String semaActual;

    @Column(length = 2,name ="SemaPrevio")
    String semaPrevio;

    @Column(length = 2,name ="SemaPeorMejor")
    String semaPeorMejor;

    @Column(length = 20,name ="Documento2")
    String documento2;

    @Column(length = 2,name ="EstDomic")
    String estDomic;

    @Column(length = 2,name ="CondDomic")
    String condDomic;

    @Column(length = 20,name ="DeudaTributaria")
    String deudaTributaria;

    @Column(length = 20,name ="DeudaLaboral")
    String deudaLaboral;

    @Column(length = 20,name ="DeudaImpaga")
    String deudaImpaga;

    @Column(length = 20,name ="DeudaProtestos")
    String deudaProtestos;

    @Column(length = 20,name ="deudaSBS")
    String deudaSBS;

    @Column(length = 2,name ="TarCtas")
    String tarCtas;

    @Column(length = 2,name ="RepNeg")
    String repNeg;

    @Column(length = 100,name ="TipoActv")
    String tipoActv;

    @Column(length = 10,name ="FechIniActv")
    String fechIniActv;

    @Column(length = 400,name ="DireccionFiscal")
    String direccionFiscal;

    @Column(length = 3,name ="CodigoWS")
    String codigoWS;

    @Column(name = "Resultado")
    Boolean resultado;

    @Column(name = "Procesado")
    Boolean procesado;






}
