package clicker.back.services;

import clicker.back.entities.Concesionarios;
import clicker.back.entities.Documentos;

import java.util.List;

public interface DocumentosService {
    Documentos save(Documentos documentos);

    void delete(Documentos documentos);

    Documentos getById(Documentos documentos);

    List<Documentos> getAll();

}
