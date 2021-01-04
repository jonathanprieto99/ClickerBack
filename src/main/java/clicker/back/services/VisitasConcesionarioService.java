package clicker.back.services;

import clicker.back.entities.Usuarios;
import clicker.back.entities.VisitasConcesionario;

import java.util.List;

public interface VisitasConcesionarioService {


    VisitasConcesionario save(VisitasConcesionario visitasConcesionario);

    void delete(VisitasConcesionario visitasConcesionario);

    VisitasConcesionario getById(VisitasConcesionario visitasConcesionario);

    List<VisitasConcesionario> getAll();

}
