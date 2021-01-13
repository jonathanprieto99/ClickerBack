package clicker.back.services;

import clicker.back.entities.SolicitudRemocionAuto;

import java.util.List;

public interface AutoRemovidoService {
    SolicitudRemocionAuto save(SolicitudRemocionAuto solicitudRemocionAuto);

    void delete(SolicitudRemocionAuto solicitudRemocionAuto);

    SolicitudRemocionAuto getById(SolicitudRemocionAuto solicitudRemocionAuto);

    List<SolicitudRemocionAuto> getAll();
}
