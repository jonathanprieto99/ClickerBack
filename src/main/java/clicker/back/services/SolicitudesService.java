package clicker.back.services;


import clicker.back.entities.ResultadosInfocorp;
import clicker.back.entities.Solicitudes;

import java.util.List;

public interface SolicitudesService {

    Solicitudes save(Solicitudes solicitudes);

    void delete(Solicitudes solicitudes);

    Solicitudes getById(Solicitudes solicitudes);

    List<Solicitudes> getAll();
}
