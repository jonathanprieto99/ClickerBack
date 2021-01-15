package clicker.back.services;

import clicker.back.Antiguo.Documentos;

import java.util.List;

public interface DocumentosService {
    Documentos save(Documentos documentos);

    void delete(Documentos documentos);

    Documentos getById(String id );

    List<Documentos> getAll();

}
